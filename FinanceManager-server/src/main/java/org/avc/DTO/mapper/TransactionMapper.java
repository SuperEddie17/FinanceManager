package org.avc.DTO.mapper;


import org.avc.DTO.ReccuringTransactionDTO;
import org.avc.DTO.TransactionDTO;
import org.avc.entity.RecurringTransactionEntity;
import org.avc.entity.TransactionEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper(componentModel = "spring")
public interface TransactionMapper {


    TransactionEntity toEntity(TransactionDTO source);


    TransactionDTO toDTO(TransactionEntity source);

    RecurringTransactionEntity toRecurringEntity(ReccuringTransactionDTO source);

    ReccuringTransactionDTO toReccuringDTO(RecurringTransactionEntity source);


}
