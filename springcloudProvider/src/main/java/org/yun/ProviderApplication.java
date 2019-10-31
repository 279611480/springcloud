package org.yun;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import java.util.ArrayList;

//启动类-创建出来的
@SpringBootApplication
@MapperScan("org.yun.mapper")
@EnableEurekaClient//本服务启动后会自动注册进Eureka服务中
public class ProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class,args);
    }

}
