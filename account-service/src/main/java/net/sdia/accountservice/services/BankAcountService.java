package net.sdia.accountservice.services;

import net.sdia.accountservice.entities.BankAccount;
import net.sdia.accountservice.repositories.BankAcountRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BankAcountService {
    private final BankAcountRepository bankAcountRepository;

    public BankAcountService(BankAcountRepository bankAcountRepository) {
        this.bankAcountRepository = bankAcountRepository;
    }

    public List<BankAccount> getAllAccounts() {
        return bankAcountRepository.findAll();
    }

    public Optional<BankAccount> getAccount(String id) {
        return bankAcountRepository.findById(id);
    }

    public BankAccount saveAccount(BankAccount customer) {
        return bankAcountRepository.save(customer);
    }
}
