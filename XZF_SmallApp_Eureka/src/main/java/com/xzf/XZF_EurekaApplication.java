package com.xzf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class XZF_EurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(XZF_EurekaApplication.class);
    }
}
