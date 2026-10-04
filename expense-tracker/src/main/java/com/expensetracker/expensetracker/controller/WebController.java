package com.expensetracker.expensetracker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    // Sirf login aur signup yahan rakhein kyunki ye transaction se alag hain
    @GetMapping("/")
    public String login() { return "login"; }

    @GetMapping("/signup")
    public String signup() { return "signup"; }

    // "/dashboard" aur "/add-transaction" yahan se hata diye gaye hain
    // kyunki ye TransactionController.java mein honge.
}
