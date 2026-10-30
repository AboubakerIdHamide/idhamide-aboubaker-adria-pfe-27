package net.sdia.accountservice.web.rest;

import net.sdia.accountservice.entities.BankAccount;
import net.sdia.accountservice.services.BankAcountService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/accounts")
public class BankAccountController {
    private final BankAcountService acountService;

    public BankAccountController(BankAcountService acountService) {
        this.acountService = acountService;
    }

    @GetMapping
    public List<BankAccount> getAllCustomers() {
        return acountService.getAllAccounts();
    }

    @GetMapping("/{id}")
    public Optional<BankAccount> getCustomer(@PathVariable String id) {
        return acountService.getAccount(id);
    }

    @PostMapping
    public BankAccount saveCustomer(@RequestBody BankAccount customer) {
        return acountService.saveAccount(customer);
    }
}
