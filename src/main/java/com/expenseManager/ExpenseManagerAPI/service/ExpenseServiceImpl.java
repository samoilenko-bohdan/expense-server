package com.expenseManager.ExpenseManagerAPI.service;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.expenseManager.ExpenseManagerAPI.domain.Expense;
import com.expenseManager.ExpenseManagerAPI.repositories.ExpenseRepository;

@Service
@AllArgsConstructor
public class ExpenseServiceImpl implements ExpenseService {

	private final ExpenseRepository expenseRepository;

	@Override
	public List<Expense> findAll() {
		List<Expense> expenses = new ArrayList<>();
		expenseRepository.findAll().forEach(expenses::add);
		return expenses;
	}

	@Override
	public List<Expense> findByMonthAndYear(String month, int year) {
		return expenseRepository.findByMonthAndYear(month, year);
	}

	@Override
	public void saveOrUpdateExpense(Expense expense) {
		expenseRepository.save(expense);
	}

	@Override
	public void deleteExpense(String id) {
		expenseRepository.deleteById(id);
	}

	@Override
	public List<Expense> findByYear(int year) {
		return expenseRepository.findByYear(year);
	}

}
