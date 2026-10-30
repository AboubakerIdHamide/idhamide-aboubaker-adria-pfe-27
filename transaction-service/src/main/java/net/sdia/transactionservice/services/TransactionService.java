package net.sdia.transactionservice.services;

import net.sdia.transactionservice.entities.Transaction;
import net.sdia.transactionservice.repositories.TransactionRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TransactionService {
    private final TransactionRepository transactionRepo;

    public TransactionService(TransactionRepository transactionRepo) {
        this.transactionRepo = transactionRepo;
    }

    public List<Transaction> getAllTransactions() {
        return transactionRepo.findAll();
    }

    public Optional<Transaction> getTransaction(String id) {
        return transactionRepo.findById(id);
    }

    public Transaction saveTransaction(Transaction customer) {
        return transactionRepo.save(customer);
    }
}
