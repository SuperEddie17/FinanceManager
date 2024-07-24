package org.avc.controller;


import org.avc.DTO.ReccuringTransactionDTO;
import org.avc.DTO.TransactionDTO;

import org.avc.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/transactions")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @PostMapping("/")
    public TransactionDTO createTransaction(@RequestBody TransactionDTO transactionDTO) {
        return transactionService.createTransaction(transactionDTO);
    }

    @PostMapping("/recurring")
    public ReccuringTransactionDTO createRecurringTransaction(@RequestBody ReccuringTransactionDTO reccuringTransactionDTO) {
        return transactionService.createRecurringTransaction(reccuringTransactionDTO);
    }

    @GetMapping("/user/{id}")
    public List<TransactionDTO> getTransactionsByUser(@PathVariable Long id) {
        return transactionService.getTransactionsByUser(id);
    }


}
