package org.avc.entity;


import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity(name = "recurrings")
@Getter
@Setter
public class RecurringTransactionEntity extends TransactionEntity {

    private LocalDate startDate;

    private LocalDate endDate;

    private String frequency;


}
