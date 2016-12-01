package com.sneb.business;

import java.util.List;

import com.sneb.bean.Account;
import com.sneb.struts.form.AccountForm;

public interface AccountBusiness {
	public List<Account> findAll();

	public void add(AccountForm aform);

	public void update(AccountForm aform);

	public void delete(Account a);

	AccountForm findByIdOfForm(AccountForm aform);

	Account findById(String userId);
}
