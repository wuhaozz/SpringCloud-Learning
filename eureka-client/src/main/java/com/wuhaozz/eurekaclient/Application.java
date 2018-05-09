package com.wuhaozz.eurekaclient;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        //SpringApplication.run(EurekaClientApplication.class, args);

        new SpringApplicationBuilder(Application.class).web(true).run(args);

    }
}
