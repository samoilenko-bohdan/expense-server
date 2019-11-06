package com.expenseManager.ExpenseManagerAPI.domain;

import lombok.Data;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;


@Table
@Data
public class Expense {

	@PrimaryKey
	private String id;
	private String description;
	private Integer amount;
	private String month;
	private int year;
}
