package org.avc.entity;

import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.time.LocalDate;
import javax.annotation.processing.Generated;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(TransactionEntity.class)
public abstract class TransactionEntity_ {

	public static volatile SingularAttribute<TransactionEntity, LocalDate> date;
	public static volatile SingularAttribute<TransactionEntity, BigDecimal> amount;
	public static volatile SingularAttribute<TransactionEntity, Boolean> isIncome;
	public static volatile SingularAttribute<TransactionEntity, String> description;
	public static volatile SingularAttribute<TransactionEntity, Long> id;
	public static volatile SingularAttribute<TransactionEntity, String> category;
	public static volatile SingularAttribute<TransactionEntity, Long> userId;

	public static final String DATE = "date";
	public static final String AMOUNT = "amount";
	public static final String IS_INCOME = "isIncome";
	public static final String DESCRIPTION = "description";
	public static final String ID = "id";
	public static final String CATEGORY = "category";
	public static final String USER_ID = "userId";

}

