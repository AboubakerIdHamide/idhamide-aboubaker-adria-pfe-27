package net.sdia.transactionservice;

import net.sdia.transactionservice.repositories.TransactionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import net.sdia.transactionservice.entities.Transaction;

import java.util.Date;

@SpringBootApplication
public class TransactionServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(TransactionServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner initAccounts(TransactionRepository txRepo) {
        return args -> {
            for (long accountId = 1; accountId <= 3; accountId++) {
                for (int i = 0; i < 2; i++) {
                    double balance = 1_000 + Math.random() * 60_000;
                    txRepo.save(new Transaction(
                            "ID-TX-"+accountId,
                            "ACC+"+accountId,
                            "DH",
                            "DEC",
                            "MA",
                            new Date()
                    ));
                }
            }
        };
    }
}
