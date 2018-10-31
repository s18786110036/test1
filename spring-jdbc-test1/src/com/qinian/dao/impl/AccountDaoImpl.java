package com.qinian.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SingleColumnRowMapper;
import org.springframework.stereotype.Repository;

import com.qinian.bean.Account;
import com.qinian.common.AccountRowMapper;
import com.qinian.dao.AccountDao;

/**
 * @author 宋敏
 * @Description: 账号数据访问实现层
 */
@Repository("accountDao")  // 标志该dao交给Sprign管理
public class AccountDaoImpl implements AccountDao {
	//定义jdbc模板
	@Autowired //自动注入
    private JdbcTemplate  jdbcTemplate;
	
	@Override
	public boolean save(Account account) {
		int save = jdbcTemplate.update("insert into tb_account(name,money) values(?,?)",account.getName(),account.getMoney());
		return save==1?true:false;
	}

	@Override
	public boolean deleteById(Integer id) {
		int save = jdbcTemplate.update("delete from tb_account where id = ?",id);
		return save==1?true:false;
	}

	@Override
	public boolean update(Account account) {
		int save = jdbcTemplate.update("update tb_account set name=?,money=? where id = ?",account.getName(),account.getMoney(),account.getId());
		return save==1?true:false;
	}

	@Override
	public Account getById(Integer id) {
		List<Account> accounts = jdbcTemplate.query("select * from tb_account where id = ?",new AccountRowMapper(),id);
		return  accounts.isEmpty()?null:accounts.get(0);
	}

	@Override
	public List<Account> getAll(int page, int pageSize) {
		List<Account> accounts = jdbcTemplate.query("select * from tb_account limit ?,?",new AccountRowMapper(),pageSize*(page-1),pageSize);
		return accounts.isEmpty()?null:accounts;
	}

	@Override
	public long getMaxCount() {
		List<Long> count = jdbcTemplate.query("select count(id) from tb_account",new SingleColumnRowMapper<Long>());
		return count.get(0);
	}

}
