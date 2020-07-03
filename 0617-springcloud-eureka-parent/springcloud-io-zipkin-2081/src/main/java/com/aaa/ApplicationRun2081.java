package com.aaa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import zipkin2.server.internal.EnableZipkinServer;

/**
 * syh
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableZipkinServer
public class ApplicationRun2081 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun2081.class, args);
    }
}
