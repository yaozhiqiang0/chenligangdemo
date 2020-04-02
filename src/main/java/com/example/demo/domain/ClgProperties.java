package com.example.demo.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ClgProperties {

    @Value("${com.clg.name}")
    private String name;
    @Value("${com.clg.password}")
    private String password;
    @Value("${com.clg.adent}")
    private String adent;
    @Value("${com.clg.meng}")
    private String meng;
    @Value("${com.clg.random}")
    private String random;
    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getAdent() {
        return adent;
    }

    public String getMeng() {
        return meng;
    }

    public String getRandom() {
        return random;
    }
}
