package net.sdia.accountservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor @AllArgsConstructor
public class BankAccount {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String customerReference;
    private String status;
    private String currency;

    @Min(value = 0)
    private Double balance;
}
