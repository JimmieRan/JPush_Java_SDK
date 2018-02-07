package com.jimmieRan.jpush.vo;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 构建JPush的推送基本信息
 */
public class JPushPayload {

    private JPushMessage jPushMessage;

    private JPushNotification jPushNotification;

    private String platform; //推送平台

    private String audience; //推送观众

    private Collection<String> aliases; //别名

    private Collection<String> tags; //标签

    private String isTiming;  //是否定时发送

    private String time;  //定时时间 格式：2017-11-21 12:10:00

    public JPushPayload(JPushMessage jPushMessage, JPushNotification jPushNotification) {
        this.jPushMessage = jPushMessage;
        this.jPushNotification = jPushNotification;
    }

    public JPushPayload(JPushMessage jPushMessage) {
        this.jPushMessage = jPushMessage;
    }

    public JPushPayload(JPushNotification jPushNotification) {
        this.jPushNotification = jPushNotification;
    }

    public JPushPayload() {
    }

    public JPushMessage getjPushMessage() {
        return jPushMessage;
    }

    public void setjPushMessage(JPushMessage jPushMessage) {
        this.jPushMessage = jPushMessage;
    }

    public JPushNotification getjPushNotification() {
        return jPushNotification;
    }

    public void setjPushNotification(JPushNotification jPushNotification) {
        this.jPushNotification = jPushNotification;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getIsTiming() {
        return isTiming;
    }

    public void setIsTiming(String isTiming) {
        this.isTiming = isTiming;
    }

    public Collection<String> getAliases() {
        return aliases;
    }

    public void setAliases(Collection<String> aliases) {
        ArrayList<String> arrayList = new ArrayList<String>();
        for (String aliase: aliases) {
            if ( aliase.indexOf(",") != -1 ){
                String[] aliasesStr = aliase.split(",");
                for (String value:aliasesStr){
                    if ( !value.trim().equals("") ){
                        arrayList.add(value);
                    }
                }
            }else {
                arrayList.add(aliase);
            }
        }
        this.aliases = arrayList;
    }

    public Collection<String> getTags() {
        return tags;
    }

    public void setTags(Collection<String> tags) {
        ArrayList<String> arrayList = new ArrayList<String>();
        for (String tag: tags) {
            if ( tag.indexOf(",") != -1 ){
                String[] tagStr = tag.split(",");
                for (String value:tagStr){
                    if ( !value.trim().equals("") ){
                        arrayList.add(value);
                    }
                }
            }else {
                arrayList.add(tag);
            }
        }
        this.tags = arrayList;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getAudience() {
        return audience;
    }

    public void setAudience(String audience) {
        this.audience = audience;
    }



    public static enum AudienceDesc {
        别名("1"),标签("2"),所有人("0");
        public String value;
        private AudienceDesc(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public static enum PlatformDesc {
        安卓("1"),IOS("2"),所有平台("0");
        public String value;
        private PlatformDesc(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public static enum isTimingDesc {
        立即("0"),定时("1");
        public String value;
        private isTimingDesc(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

}
