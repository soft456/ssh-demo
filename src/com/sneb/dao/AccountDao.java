package com.sneb.dao;

import java.util.List;

import com.sneb.bean.Account;

public interface AccountDao {
	public List<Account> findAll();

	public void save(Account a);

	public void update(Account a);

	public void delete(Account a);

	public List<Account> findById(String userId);
}
