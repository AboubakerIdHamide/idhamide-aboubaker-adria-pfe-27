package net.sdia.transactionservice.web.rest;

import net.sdia.transactionservice.entities.Transaction;
import net.sdia.transactionservice.services.TransactionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/transactions")
public class TransactionController {
    private final TransactionService txService;

    public TransactionController(TransactionService txService) {
        this.txService = txService;
    }

    @GetMapping
    public List<Transaction> getAllTransactions() {
        return txService.getAllTransactions();
    }

    @GetMapping("/{id}")
    public Optional<Transaction> getTransaction(@PathVariable String id) {
        return txService.getTransaction(id);
    }

    @PostMapping
    public Transaction saveCustomer(@RequestBody Transaction customer) {
        return txService.saveTransaction(customer);
    }
}
