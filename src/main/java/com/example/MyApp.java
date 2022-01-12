package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyAppConfig.class);

        MessageService messageService = applicationContext.getBean("messageService", MessageService.class);
        MessageService messageService2 = applicationContext.getBean("messageService", MessageService.class);

        System.out.println(messageService.getMessage());

        System.out.println("Bean 1: " + messageService.hashCode() + "\nBean 2: " + messageService2.hashCode());

        applicationContext.close();
    }
}
