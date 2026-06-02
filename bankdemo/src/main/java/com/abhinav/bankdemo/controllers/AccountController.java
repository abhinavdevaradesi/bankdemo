package com.abhinav.bankdemo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @GetMapping("/myAccount")
    public String myAccount(){
        return "Here are the account details for my account";
    }
}
