package com.jcb826.flashcash.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Link {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @ManyToOne
    User user1;
    @ManyToOne
    User user2;

}
