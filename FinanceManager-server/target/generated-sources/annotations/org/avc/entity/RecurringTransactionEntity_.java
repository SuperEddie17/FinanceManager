package org.avc.entity;

import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.time.LocalDate;
import javax.annotation.processing.Generated;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(RecurringTransactionEntity.class)
public abstract class RecurringTransactionEntity_ extends org.avc.entity.TransactionEntity_ {

	public static volatile SingularAttribute<RecurringTransactionEntity, LocalDate> endDate;
	public static volatile SingularAttribute<RecurringTransactionEntity, LocalDate> startDate;
	public static volatile SingularAttribute<RecurringTransactionEntity, String> frequency;

	public static final String END_DATE = "endDate";
	public static final String START_DATE = "startDate";
	public static final String FREQUENCY = "frequency";

}

