package com.example.autowired.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//TRANSITIONED FROM XML TO ANNOTATION
@Configuration
@ComponentScan(basePackages = "com.example.autowired.annotation")
public class AppConfig {
}
