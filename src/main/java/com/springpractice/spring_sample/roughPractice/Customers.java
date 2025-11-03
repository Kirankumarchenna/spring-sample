package com.springpractice.spring_sample.roughPractice;


import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
@Lazy
@Component
public class Customers {

     public Customers(){
        System.out.println("Initialzing Customers...");
    }
}