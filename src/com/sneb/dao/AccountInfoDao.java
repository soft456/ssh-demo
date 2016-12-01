package com.sneb.dao;

import java.util.List;

import com.sneb.bean.AccountInfo;

public interface AccountInfoDao {

	public void save(AccountInfo ai);

	public void update(AccountInfo ai);

	public void delete(AccountInfo ai);

	public List<AccountInfo> findById(String userId);
}
