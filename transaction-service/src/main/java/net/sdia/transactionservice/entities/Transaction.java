package net.sdia.transactionservice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.sdia.transactionservice.models.Account;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor @AllArgsConstructor
public class Transaction {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String accountId;
    private Long amount;
    private String currency;
    private String merchantCategory;
    private String country;
    private Date createdAt;
    @Transient
    private Account account;
}
