package com.springpractice.spring_sample.roughPractice;

import com.springpractice.spring_sample.roughPractice.Order;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User {

    @Autowired
    Customers customers;
    @Autowired
    Order order;

    @PostConstruct
    public void initialize(){
        System.out.println("This bean has been constructed..");
    }

    @PreDestroy
    public void predestroy(){
        System.out.println("Bean is about to destroy...");
    }

    public User(){
        System.out.println("This is user initializing");
    }
}
