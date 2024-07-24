package org.avc.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity(name = "transactions")
@Getter
@Setter
@Inheritance(strategy = InheritanceType.JOINED)
public class TransactionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long userId;

    @Column(nullable = false)
    private boolean isIncome; //true = income, false=expense

    @Column(nullable = false)
    private BigDecimal amount;


    private LocalDate date;


    private String category;

    private String description;





}
