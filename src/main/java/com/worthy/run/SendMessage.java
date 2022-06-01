package com.worthy.run;


import cn.hutool.core.date.DateTime;

import java.util.TimeZone;

/**
 * @author worthy
 * @create 2022-05-31 10:43
 */


public class SendMessage {
    public  String mainHandler(TimerEvent timerEvent) throws Exception {
        String key = System.getenv("key");
        String message = System.getenv("message");
        TimeZone timeZone = TimeZone.getTimeZone("Asia/Shanghai");
        DateTime dateTime = new DateTime(timeZone);
        String botUrl = "https://qyapi.weixin.qq.com/cgi-bin/webhook/send?key="+key;
        WeChatBotUtils weChatBot = new WeChatBotUtils(botUrl, false);

// 发送文本消息
//        weChatBot.sendTextMsg("测试消息\n" + "hello world!");

// 发送图片消息
//        weChatBot.sendImgMsg("C:/User/Desktop/test.jpg");

// 发送MarkDown消息
        String markdownMsg =
                        "    >**提醒详情** \n" +
                        "    >\n" +
                        "    >事　项：<font color=\"info\">"+message+"</font> \n" +
                        "    >日　期：<font color=\"warning\">"+dateTime.toString("yyyy年MM月dd日")+"</font>\n" +
                        "    >时　间：<font color=\"comment\">"+dateTime.toString("HH时mm分ss秒")+"</font>\n" +
                        "    >\n";
        weChatBot.sendMarKDownMsg(markdownMsg);

// 发送文件消息
//        weChatBot.sendFileMsg("C:/User/Desktop/test.xlsx");

        return "success";
    }

}

