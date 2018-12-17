package com.qf.my.ten.square.ui;

import com.qf.my.ten.square.commons.utils.IdWorker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EntityScan(basePackages = "com.qf.my.ten.square.domain.entity")
public class MyTenSquareUiApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyTenSquareUiApplication.class, args);
    }


    @Bean
    public IdWorker idWorker(){
        return new IdWorker(1,1);
    }

}

