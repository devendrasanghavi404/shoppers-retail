package com.shoppers.shoppersuserservice.service;

import org.springframework.context.annotation.Configuration;

import java.util.function.Predicate;

@Configuration
public class EmailValidator implements Predicate<String> {
    @Override
    public boolean test(String s) {
        //Regex to validate
        return true;
    }
}
