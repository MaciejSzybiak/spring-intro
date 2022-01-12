package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MyAppConfig {
    @Bean
    @Scope("prototype")
    public MessageService messageService() {
        return new MyNameMessageService();
    }
}
