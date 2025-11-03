package com.springpractice.spring_sample.roughPractice;


import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

//@Lazy
@Component
public class Order {

    public Order(){
        System.out.println("Initializing order..");
    }
}
