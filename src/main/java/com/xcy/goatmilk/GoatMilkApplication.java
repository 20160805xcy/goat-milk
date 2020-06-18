package com.xcy.goatmilk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = {"com.xcy.goatmilk.mapper"})
public class GoatMilkApplication {

    public static void main(String[] args) {
        SpringApplication.run(GoatMilkApplication.class, args);
    }

}
