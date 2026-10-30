package net.sdia.accountservice.repositories;

import net.sdia.accountservice.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAcountRepository extends JpaRepository<BankAccount, String> {

}
