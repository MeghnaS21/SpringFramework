package com.example.componentscan.annotations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//TRANSITIONED FROM XML TO ANNOTATION
@Configuration
@ComponentScan(basePackages = "com.example.componentscan.annotations")
public class AppConfig {
}
