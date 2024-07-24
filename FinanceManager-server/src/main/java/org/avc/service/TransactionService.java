package org.avc.service;

import org.avc.DTO.ReccuringTransactionDTO;
import org.avc.DTO.TransactionDTO;
import java.util.List;


public interface TransactionService {

    TransactionDTO createTransaction(TransactionDTO transactionDTO);

    ReccuringTransactionDTO createRecurringTransaction(ReccuringTransactionDTO reccuringTransactionDTO);

    void deleteTransaction(Long id);

    List<TransactionDTO> getTransactionsByUser(Long id);



}
