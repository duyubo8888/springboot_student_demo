package com.dyb.springboot_student_demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.dyb")
@MapperScan("com.dyb.dao")
public class SpringbootStudentDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootStudentDemoApplication.class, args);
    }

}
