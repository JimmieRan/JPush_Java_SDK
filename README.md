# JPush_Java_SDK

简化JPush推送信息封装，构建工具类直接调用推送：
 
  1、所有推送信息都封装在 JPushPayload 类中，所以整个推送思路就是构建好 JPushPayload 对象；
  2、JPushPayload 类封装了推送平台、推送目标、推送通知信息对象、推送message信息对象,需要分别构建好这些内容；
  3、推送方法一共四种：
    ① sendPush(JPushPayload jPushPayload)  限：1000个别名alias、20个标签tag以下的推送（立即推送）
    ② sendPushSchedule(String name, String time, JPushPayload jPushPayload) 限：1000个别名alias、20个标签tag以下的推送（定时推送）
    ③ sendPushes(JPushPayload jPushPayload) 批量不限制别名alias、标签tag 个数（立即推送）
    ④ sendPushesSchedule(final String name, final String time, JPushPayload jPushPayload) 批量不限制别名alias、标签tag 个数（定时推送）
     
