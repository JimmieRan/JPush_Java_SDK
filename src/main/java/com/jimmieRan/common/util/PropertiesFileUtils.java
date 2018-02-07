package com.jimmieRan.common.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class PropertiesFileUtils {

    static Properties congifProperties = null;
    public static final Map<String, String> confMap = new HashMap<String, String>();

    static {
        try {

            InputStream configInputStream = PropertiesFileUtils.class.getClassLoader().getResourceAsStream(Constant.SYSTEM_PROPERTIES);
            congifProperties = new Properties();
            congifProperties.load(configInputStream);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static String getPropertiesPath() {
        String path = Thread.currentThread().getContextClassLoader().getResource("").getPath();
        if (File.separatorChar == '\\') {
            //windows 系统样式：/D:/work/，要去掉开头的 /
            path = path.substring(1);
        }
        return path + Constant.SYSTEM_PROPERTIES;
    }

    public static String readValue(String key) {
        Properties props = new Properties();
        String path = getPropertiesPath();
        FileInputStream fis = null;
        try {

            fis = new FileInputStream(path);
            props.load(fis);
            String value = props.getProperty(key);
            return value;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (null != fis) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        String value = PropertiesFileUtils.readValue("localhost_path");
        System.out.println("value = " + value);
    }

}
