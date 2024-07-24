package org.avc.service;


import org.avc.DTO.ReccuringTransactionDTO;
import org.avc.DTO.TransactionDTO;
import org.avc.DTO.mapper.TransactionMapper;
import org.avc.entity.RecurringTransactionEntity;
import org.avc.entity.TransactionEntity;
import org.avc.entity.repository.TransactionRepository;
import org.avc.entity.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    @Autowired
    private TransactionMapper transactionMapper;
    @Autowired
    private UserRepository userRepository;


    @Override
    public TransactionDTO createTransaction(TransactionDTO transactionDTO) {
        TransactionEntity transactionEntity = transactionMapper.toEntity(transactionDTO);
        transactionEntity = transactionRepository.save(transactionEntity);

        return transactionMapper.toDTO(transactionEntity);
    }

    @Override
    public ReccuringTransactionDTO createRecurringTransaction(ReccuringTransactionDTO reccuringTransactionDTO) {
        //Save reccuring transaction
        RecurringTransactionEntity recurringTransactionEntity = transactionMapper.toRecurringEntity(reccuringTransactionDTO);
        recurringTransactionEntity = transactionRepository.save(recurringTransactionEntity);

        //generate single ones transactions
        List<TransactionEntity> transactions = generateRecurringTransactions(reccuringTransactionDTO);
        transactionRepository.saveAll(transactions);

        return transactionMapper.toReccuringDTO(recurringTransactionEntity);
    }

    @Override
    public void deleteTransaction(Long id) {

    }

    private List<TransactionEntity> generateRecurringTransactions(ReccuringTransactionDTO recurringTransactionDTO) {
        List<TransactionEntity> transactions = new ArrayList<>();
        LocalDate currentDate = recurringTransactionDTO.getStartDate();
        int installmentNumber = 1;
        int totalInstallments = calculateTotalInstallments(recurringTransactionDTO);

        while (!currentDate.isAfter(recurringTransactionDTO.getEndDate())) {
            TransactionEntity transaction = new TransactionEntity();
            transaction.setUserId(recurringTransactionDTO.getUserId());
            transaction.setIncome(recurringTransactionDTO.isIncome());
            transaction.setAmount(recurringTransactionDTO.getAmount());
            transaction.setDate(currentDate);
            transaction.setCategory(recurringTransactionDTO.getCategory());
            transaction.setDescription(recurringTransactionDTO.getDescription() + " " + installmentNumber + "/" + totalInstallments);
            transactions.add(transaction);
            currentDate = getNextDate(currentDate, recurringTransactionDTO.getFrequency());
            installmentNumber++;
        }
        return transactions;
    }

    private int calculateTotalInstallments(ReccuringTransactionDTO recurringTransactionDTO) {
        int count = 0;
        LocalDate currentDate = recurringTransactionDTO.getStartDate();
        while (!currentDate.isAfter(recurringTransactionDTO.getEndDate())) {
            count++;
            currentDate = getNextDate(currentDate, recurringTransactionDTO.getFrequency());
        }
        return count;
    }

    private LocalDate getNextDate(LocalDate currentDate, String frequency) {
        switch (frequency.toLowerCase()) {
            case "weekly":
                return currentDate.plusWeeks(1);
            case "monthly":
                return currentDate.plusMonths(1);
            case "yearly":
                return currentDate.plusYears(1);
            default:
                throw new IllegalArgumentException("Unknown frequency: " + frequency);
        }
    }

        @Override
        public List<TransactionDTO> getTransactionsByUser (Long id){
            List<TransactionEntity> transactions = transactionRepository.findByUserId(id);

            List<TransactionDTO> transactionDTOs = transactions.stream()
                    .map(i->transactionMapper.toDTO(i))
                    .toList();

            return transactionDTOs;


        }





}
