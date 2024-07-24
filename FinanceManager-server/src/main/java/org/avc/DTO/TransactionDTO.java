package org.avc.DTO;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class TransactionDTO {

    @JsonProperty("_id")
    private Long id;


    private Long userId;

    @JsonProperty("isIncome")
    private boolean isIncome; //true = income, false=expanse

    private BigDecimal amount;

    private LocalDate date;

    private String category;

    private String description;


}
