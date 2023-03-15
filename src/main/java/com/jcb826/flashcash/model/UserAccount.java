package com.jcb826.flashcash.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class UserAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer accountId;

    private Double amount;
    private String iban;

    public UserAccount plus(double amount) {

        this.amount += amount;
        return this;
    }

    public UserAccount minus(double amount) {

        this.amount -= amount;
        return this;
    }
}
