package com.expensetracker.expensetracker.controller;

import com.expensetracker.expensetracker.entity.Transaction;
import com.expensetracker.expensetracker.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class TransactionController {

    @Autowired
    private TransactionRepository transactionRepository;

    @GetMapping("/dashboard")
    public String showDashboard(Model model) {
        model.addAttribute("transactions", transactionRepository.findAll());
        return "dashboard";
    }

    @GetMapping("/add-transaction")
    public String showAddForm(Model model) {
        model.addAttribute("transaction", new Transaction());
        return "add-transaction";
    }

    @PostMapping("/add-transaction")
    public String saveTransaction(@ModelAttribute("transaction") Transaction transaction) {
        transactionRepository.save(transaction);
        return "redirect:/dashboard";
    }
}