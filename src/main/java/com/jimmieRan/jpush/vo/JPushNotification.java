package com.jimmieRan.jpush.vo;

/**
 * Notification信息对象
 */
public class JPushNotification {
    private String notificationTitle;  //推送标题

    private String notificationContent; //推送内容

    private JPushExtras jPushExtras; //附加字段

    public String getNotificationTitle() {
        return notificationTitle;
    }

    public void setNotificationTitle(String notificationTitle) {
        this.notificationTitle = notificationTitle;
    }

    public String getNotificationContent() {
        return notificationContent;
    }

    public void setNotificationContent(String notificationContent) {
        this.notificationContent = notificationContent;
    }

    public JPushExtras getjPushExtras() {
        return jPushExtras;
    }

    public void setjPushExtras(JPushExtras jPushExtras) {
        this.jPushExtras = jPushExtras;
    }

}
