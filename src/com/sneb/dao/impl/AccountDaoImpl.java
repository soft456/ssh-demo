package com.sneb.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.sneb.bean.Account;
import com.sneb.dao.AccountDao;

public class AccountDaoImpl extends HibernateDaoSupport implements AccountDao {

	private AccountDao accountDao;

	public AccountDao getAccountDao() {
		return accountDao;
	}

	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	@Override
	public List<Account> findAll() {

		String hql = "from Account a order by a.userId DESC";

		Query query = this.getSession().createQuery(hql);
		query.setFirstResult(0); // limit 0,20中的0
		query.setMaxResults(20); // limit 0,20中的20

		List<Account> list = query.list();
		this.getSession().close();

		return list;

	}

	@Override
	public void save(Account a) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(a);
	}

	@Override
	public void update(Account a) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(a);
	}

	@Override
	public void delete(Account a) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(a);
	}

	@Override
	public List<Account> findById(String userId) {
		// TODO Auto-generated method stub

		String hql = "from Account a where a.userId='" + userId + "'";
		List<Account> list = this.getHibernateTemplate().find(hql);

		return list;
	}

}
