package com.pocspringcloudclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cloudconfig")
public class CloudConfigController {

    @Value("${clientapp-any-property}")
    private String clientAppProerty1;

    @Value("${springcloud-configserver-application-anyproperty}")
    private String clientAppProerty2;

    @GetMapping("/values")
    public String getClientAppProertyValue(){
        return clientAppProerty1+" AND "+clientAppProerty2;
    }
}
