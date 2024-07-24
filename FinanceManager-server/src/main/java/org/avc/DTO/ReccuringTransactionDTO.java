package org.avc.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReccuringTransactionDTO extends TransactionDTO {

    private LocalDate startDate;
    private LocalDate endDate;
    private String frequency; //e.g., "weekly", "monthly", "yearly"


}
