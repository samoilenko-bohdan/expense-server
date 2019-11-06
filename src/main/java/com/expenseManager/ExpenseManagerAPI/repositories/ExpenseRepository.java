package com.expenseManager.ExpenseManagerAPI.repositories;

import java.util.List;

import com.expenseManager.ExpenseManagerAPI.domain.Expense;
import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpenseRepository extends CrudRepository<Expense, String> {

	@AllowFiltering
	List<Expense> findByMonthAndYear(String month, int year);

	@AllowFiltering
	List<Expense> findByYear(int year);



}
