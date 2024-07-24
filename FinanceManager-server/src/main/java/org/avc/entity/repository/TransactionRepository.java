package org.avc.entity.repository;

import org.avc.entity.TransactionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionRepository extends JpaRepository<TransactionEntity, Long> {
    List<TransactionEntity> findByUserId(Long userId);
    List<TransactionEntity> findByCategory(String category);
    List<TransactionEntity> findByIsIncome(Boolean isIncome);


}
