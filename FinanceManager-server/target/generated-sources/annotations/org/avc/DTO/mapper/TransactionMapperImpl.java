package org.avc.DTO.mapper;

import javax.annotation.processing.Generated;
import org.avc.DTO.ReccuringTransactionDTO;
import org.avc.DTO.TransactionDTO;
import org.avc.entity.RecurringTransactionEntity;
import org.avc.entity.TransactionEntity;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 19 (Oracle Corporation)"
)
@Component
public class TransactionMapperImpl implements TransactionMapper {

    @Override
    public TransactionEntity toEntity(TransactionDTO source) {
        if ( source == null ) {
            return null;
        }

        TransactionEntity transactionEntity = new TransactionEntity();

        transactionEntity.setId( source.getId() );
        transactionEntity.setUserId( source.getUserId() );
        transactionEntity.setIncome( source.isIncome() );
        transactionEntity.setAmount( source.getAmount() );
        transactionEntity.setDate( source.getDate() );
        transactionEntity.setCategory( source.getCategory() );
        transactionEntity.setDescription( source.getDescription() );

        return transactionEntity;
    }

    @Override
    public TransactionDTO toDTO(TransactionEntity source) {
        if ( source == null ) {
            return null;
        }

        TransactionDTO transactionDTO = new TransactionDTO();

        transactionDTO.setId( source.getId() );
        transactionDTO.setUserId( source.getUserId() );
        transactionDTO.setIncome( source.isIncome() );
        transactionDTO.setAmount( source.getAmount() );
        transactionDTO.setDate( source.getDate() );
        transactionDTO.setCategory( source.getCategory() );
        transactionDTO.setDescription( source.getDescription() );

        return transactionDTO;
    }

    @Override
    public RecurringTransactionEntity toRecurringEntity(ReccuringTransactionDTO source) {
        if ( source == null ) {
            return null;
        }

        RecurringTransactionEntity recurringTransactionEntity = new RecurringTransactionEntity();

        recurringTransactionEntity.setId( source.getId() );
        recurringTransactionEntity.setUserId( source.getUserId() );
        recurringTransactionEntity.setIncome( source.isIncome() );
        recurringTransactionEntity.setAmount( source.getAmount() );
        recurringTransactionEntity.setDate( source.getDate() );
        recurringTransactionEntity.setCategory( source.getCategory() );
        recurringTransactionEntity.setDescription( source.getDescription() );
        recurringTransactionEntity.setStartDate( source.getStartDate() );
        recurringTransactionEntity.setEndDate( source.getEndDate() );
        recurringTransactionEntity.setFrequency( source.getFrequency() );

        return recurringTransactionEntity;
    }

    @Override
    public ReccuringTransactionDTO toReccuringDTO(RecurringTransactionEntity source) {
        if ( source == null ) {
            return null;
        }

        ReccuringTransactionDTO reccuringTransactionDTO = new ReccuringTransactionDTO();

        reccuringTransactionDTO.setId( source.getId() );
        reccuringTransactionDTO.setUserId( source.getUserId() );
        reccuringTransactionDTO.setIncome( source.isIncome() );
        reccuringTransactionDTO.setAmount( source.getAmount() );
        reccuringTransactionDTO.setDate( source.getDate() );
        reccuringTransactionDTO.setCategory( source.getCategory() );
        reccuringTransactionDTO.setDescription( source.getDescription() );
        reccuringTransactionDTO.setStartDate( source.getStartDate() );
        reccuringTransactionDTO.setEndDate( source.getEndDate() );
        reccuringTransactionDTO.setFrequency( source.getFrequency() );

        return reccuringTransactionDTO;
    }
}
