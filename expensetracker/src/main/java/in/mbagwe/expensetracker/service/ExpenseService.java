package in.mbagwe.expensetracker.service;

import java.util.List;

import in.mbagwe.expensetracker.model.Expense;

public interface ExpenseService {

	List<Expense> findAll();

	Expense save(Expense expense);

	Expense findById(Long id);

	void delete(Long id);

}