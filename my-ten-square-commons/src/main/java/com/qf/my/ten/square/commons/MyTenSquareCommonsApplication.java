package com.qf.my.ten.square.commons;

import com.qf.my.ten.square.commons.utils.IdWorker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MyTenSquareCommonsApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyTenSquareCommonsApplication.class, args);
    }

    @Bean
    public IdWorker idWorker(){
        return new IdWorker(1,1);
    }

}

