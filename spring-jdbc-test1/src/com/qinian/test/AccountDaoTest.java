package com.qinian.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.qinian.bean.Account;
import com.qinian.dao.AccountDao;

@Component
public class AccountDaoTest {
    
	@Autowired
	private AccountDao accountDao;
	
	@SuppressWarnings("resource")
	@Before
	public void inti() {
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
		accountDao=ac.getBean("accountDao",AccountDao.class);
	}
	
	@Test
	public void save() {
		Account account=new Account();
		account.setName("ÀŒ√Ù14∫≈");
		System.out.println(accountDao.save(account));
	}

	@Test
	public void deleteById() {
		Integer id=14;
		System.out.println(accountDao.deleteById(id));
	}

	@Test
	public void update() {
		Account account=new Account();
		account.setId(13);
		account.setName("ÀŒ√Ù–ﬁ∏ƒ13∫≈");
		System.out.println(accountDao.update(account));
	}

	@Test
	public void getById() {
		Integer id=14;
		System.out.println(accountDao.getById(id));
	}

	@Test
	public void getAll() {
		int page=3;
		int pageSize=15;
		List<Account> all = accountDao.getAll(page, pageSize);
		if(all==null) {
			System.out.println(all);
		}else {
			for (Account account : all) {
				System.out.println(account);
			}
		}
		
	}

	@Test
	public void getMaxCount() {
		System.out.println(accountDao.getMaxCount());
	}

}
