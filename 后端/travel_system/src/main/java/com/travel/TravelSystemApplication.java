package com.travel;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.travel.mapper")
public class TravelSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(TravelSystemApplication.class, args);
    }

}
