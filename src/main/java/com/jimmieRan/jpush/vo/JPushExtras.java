package com.jimmieRan.jpush.vo;

public class JPushExtras {

    private int pageType;  //推送落地页标识

    private String pageUrlForIOS = "";  //H5url

    private String pageUrlForAndroid = "";  //H5url

    private String pkid = "";  //主键参数

    private String categoryName = ""; //分类名

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getPkid() {
        return pkid;
    }

    public void setPkid(String pkid) {
        this.pkid = pkid;
    }

    public int getPageType() {
        return pageType;
    }

    public void setPageType(int pageType) {
        this.pageType = pageType;
    }

    public String getPageUrlForIOS() {
        return pageUrlForIOS;
    }

    public void setPageUrlForIOS(String pageUrlForIOS) {
        this.pageUrlForIOS = pageUrlForIOS;
    }

    public String getPageUrlForAndroid() {
        return pageUrlForAndroid;
    }

    public void setPageUrlForAndroid(String pageUrlForAndroid) {
        this.pageUrlForAndroid = pageUrlForAndroid;
    }

    public static enum PageTypeDesc {

        会员中心首页(1);

        public int value;
        private PageTypeDesc(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }
}
