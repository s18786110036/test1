package com.qinian.common;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.qinian.bean.Account;

/**
 * @author ÀŒ√Ù
 * @Description: ’À∫≈  ––”≥…‰ ¿‡
 */
public class AccountRowMapper implements RowMapper<Account> {

	@Override
	public Account mapRow(ResultSet rs, int arg1) throws SQLException {
		
		return new Account(rs.getInt("id"), rs.getString("name"), rs.getFloat("money"));
	}
     
}
