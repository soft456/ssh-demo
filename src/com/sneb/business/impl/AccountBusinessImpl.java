package com.sneb.business.impl;

import java.util.List;

import com.sneb.bean.Account;
import com.sneb.bean.AccountInfo;
import com.sneb.business.AccountBusiness;
import com.sneb.dao.AccountDao;
import com.sneb.dao.AccountInfoDao;
import com.sneb.struts.form.AccountForm;

public class AccountBusinessImpl implements AccountBusiness {

	private AccountDao accountDao;
	private AccountInfoDao accountInfoDao;

	public AccountInfoDao getAccountInfoDao() {
		return accountInfoDao;
	}

	public void setAccountInfoDao(AccountInfoDao accountInfoDao) {
		this.accountInfoDao = accountInfoDao;
	}

	public AccountDao getAccountDao() {
		return accountDao;
	}

	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	@Override
	public List<Account> findAll() {
		List<Account> list = accountDao.findAll();
		return list;
	}

	@Override
	public void add(AccountForm aform) {
		// TODO Auto-generated method stub
		Account a = new Account();
		a.setUserId(aform.getUserId());
		a.setUserMobile(aform.getUserMobile());
		a.setUserEmail(aform.getUserEmail());
		a.setUserPwd(aform.getUserPwd());
		a.setDemo(aform.getDemo());
		a.setUserStatus((short) 0);
		accountDao.save(a);
	}

	@Override
	public void update(AccountForm aform) {
		// TODO Auto-generated method stub
		Account a = new Account();
		a.setId(aform.getId());
		a.setUserId(aform.getUserId());
		a.setUserEmail(aform.getUserEmail());
		a.setUserMobile(aform.getUserMobile());
		a.setUserPwd(aform.getUserPwd());
		a.setDemo(aform.getDemo());
		accountDao.update(a);
		
		//写扩展表
		AccountInfo ai = new AccountInfo();
		ai.setUserId(aform.getUserId());
		ai.setUserRealname(aform.getUserRealname());
		accountInfoDao.save(ai);
		
	}

	@Override
	public void delete(Account a) {
		// TODO Auto-generated method stub		
		
		AccountInfo ai = new AccountInfo();
		ai.setUserId(a.getUserId());
		accountInfoDao.delete(ai);
		
		accountDao.delete(a);
	}

	@Override
	public AccountForm findByIdOfForm(AccountForm aform) {
		// TODO Auto-generated method stub

		String userId = aform.getUserId();
		List<Account> list = accountDao.findById(userId);

		// 读取扩展表信息,用户真实姓名
		List<AccountInfo> listAi = accountInfoDao.findById(userId);
		if ((null != listAi) && (listAi.size() > 0)) {
			AccountInfo accountInfo = listAi.get(0);
			aform.setUserRealname(accountInfo.getUserRealname());
		}

		if ((null != list) && (list.size() > 0)) {
			Account account = list.get(0);
			aform.setId(account.getId());
			aform.setUserMobile(account.getUserMobile());
			aform.setUserEmail(account.getUserEmail());
			aform.setUserPwd(account.getUserPwd());
			aform.setDemo(account.getDemo());

		}

		return aform;
	}

	@Override
	public Account findById(String userId) {
		// TODO Auto-generated method stub

		List<Account> list = accountDao.findById(userId);
		Account u = null;
		if ((null != list) && (list.size() > 0)) {
			u = list.get(0);
		}

		return u;
	}

}
