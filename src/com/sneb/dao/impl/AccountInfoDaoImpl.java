package com.sneb.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.sneb.bean.Account;
import com.sneb.bean.AccountInfo;
import com.sneb.dao.AccountInfoDao;

public class AccountInfoDaoImpl extends HibernateDaoSupport implements AccountInfoDao{

	@Override
	public void save(AccountInfo ai) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(ai);
	}

	@Override
	public void update(AccountInfo ai) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(ai);
	}

	@Override
	public void delete(AccountInfo ai) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(ai);
	}

	@Override
	public List<AccountInfo> findById(String userId) {
		// TODO Auto-generated method stub
		String hql = "from AccountInfo ai where ai.userId='" + userId + "'";
		List<AccountInfo> list = this.getHibernateTemplate().find(hql);

		return list;		
	}

}
