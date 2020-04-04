package com.zjw.yttj.controller;


import com.zjw.yttj.config.WeixinConfig;
import com.zjw.yttj.model.WxAccessToken4Auth;
import com.zjw.yttj.model.WxUserInfo;
import com.zjw.yttj.model.WxUserInfo4Auth;
import com.zjw.yttj.util.WeixinUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.UUID;

@Controller
public class WebController {
    static Logger logger = LoggerFactory.getLogger(WebController.class);
    @Autowired
    WeixinConfig weixinConfig;
    @Autowired
    WeixinUtil weixinUtil;

    @RequestMapping(value = "/yttj", method = RequestMethod.GET)
    public String yttj(){
        return "redirect:/yttj_authorize";
    }
    /*
    * 回调函数
    * */
    @RequestMapping(value = "/yttj_back", method = RequestMethod.GET)
    public String yttjAuthBack(@RequestParam String code, @RequestParam String state, Model model){
        //获取网页授权的access token
        WxAccessToken4Auth accessToken = weixinUtil.getAccessToken4Auth(code);
        //拉取用户信息
        WxUserInfo4Auth userInfo = weixinUtil.getUserInfo4Auth(accessToken.getAccess_token(), accessToken.getOpenid());

        model.addAttribute("userInfo", userInfo);

        Long timestamp = System.currentTimeMillis() / 1000;
        String nonceStr = UUID.randomUUID().toString();
        String url = weixinConfig.getUrl_prefix() + "/yttj_back?code=" + code + "&state=" + state;
        String signature = weixinUtil.getJsapiSignature(nonceStr, String.valueOf(timestamp), url);

        model.addAttribute("appId", weixinConfig.getAppid());
        model.addAttribute("timestamp", timestamp);
        model.addAttribute("nonceStr", nonceStr);
        model.addAttribute("signature", signature);
        return "login";
    }

    /*
    * 异步获取用户信息
    * */
    @RequestMapping(value = "/subscribe_status", method = RequestMethod.GET)
    @ResponseBody
    public boolean getSubscribeStatus(@RequestParam String openId){
        WxUserInfo userInfo = weixinUtil.getUserInfo(openId);
        return userInfo != null && userInfo.getSubscribe() == 1;
    }


    @RequestMapping(value = "/yttj_authorize", method = RequestMethod.GET)
    public String yttjAuthorize(){
        String redirect_uri = weixinConfig.getUrl_prefix() + "/yttj_back";

        String url = "https://open.weixin.qq.com/connect/oauth2/authorize?appid=" + weixinConfig.getAppid()
                + "&redirect_uri=" + redirect_uri + "&response_type=code&scope=snsapi_userinfo&state=STATE#wechat_redirect";

        return "redirect:" + url;
    }
}
