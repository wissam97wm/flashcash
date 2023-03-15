package com.jcb826.flashcash.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class FlashCashAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Double totalAmount;
    private Double flashCashAmount;

}
