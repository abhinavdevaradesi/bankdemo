package com.abhinav.bankdemo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoansController {
    @GetMapping("/myLoans")
    public String myLoans(){
        return "Here are the loans details for my account";
    }
}
