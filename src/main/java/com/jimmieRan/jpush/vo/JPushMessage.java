package com.jimmieRan.jpush.vo;

/**
 * message信息对象
 */
public class JPushMessage {

    private String msgContent; //message内容

    private String msgTitle;  //message标题

    private JPushExtras jPushExtras; //message附加内容

    public String getMsgContent() {
        return msgContent;
    }

    public void setMsgContent(String msgContent) {
        this.msgContent = msgContent;
    }

    public String getMsgTitle() {
        return msgTitle;
    }

    public void setMsgTitle(String msgTitle) {
        this.msgTitle = msgTitle;
    }

    public JPushExtras getjPushExtras() {
        return jPushExtras;
    }

    public void setjPushExtras(JPushExtras jPushExtras) {
        this.jPushExtras = jPushExtras;
    }
}
