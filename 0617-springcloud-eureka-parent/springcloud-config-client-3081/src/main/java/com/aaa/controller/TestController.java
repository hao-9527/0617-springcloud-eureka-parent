package com.aaa.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * syh
 */
@RestController
public class TestController {
    @Value("${server.port}")
    private String port;

    @Value("${spring.datasource.driver-class-name}")
    private String driverClassName;

    @Value("${mybatis.type-aliases-package}")
    private String mybatisTypeAliasesPackage;

    @RequestMapping("/test")
    public String test() {
        return port + "-----" + driverClassName + "-------" + mybatisTypeAliasesPackage;
    }
}
