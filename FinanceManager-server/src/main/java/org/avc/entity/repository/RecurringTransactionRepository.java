package org.avc.entity.repository;

import org.avc.entity.RecurringTransactionEntity;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface RecurringTransactionRepository extends TransactionRepository {
    List<RecurringTransactionEntity> findByFrequency(String frequency);
}
