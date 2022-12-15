package com.devitron.servtronic.servicetest01.config;

import com.devitron.servtronic.servicebase.config.ConfigBase;


public class ServiceTest01Config extends ConfigBase {

    private String message01 = "";
    private String message02 = "";


    public String getMessage01() {
        return message01;
    }

    public void setMessage01(String message01) {
        this.message01 = message01;
    }

    public String getMessage02() {
        return message02;
    }

    public void setMessage02(String message02) {
        this.message02 = message02;
    }
}
