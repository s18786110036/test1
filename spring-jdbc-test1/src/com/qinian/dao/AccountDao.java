package com.qinian.dao;

import java.util.List;

import com.qinian.bean.Account;

/**
 * @author 宋敏
 * @Description: 账号数据访问接口层
 */
public interface AccountDao {
	/**
	    * 保存账号
	 * @param account  保存的账户
	 * @return 保存成功返回true,保存失败返回false
	 */
    public boolean save(Account account);
    
    /**
              * 根据id删除账号
     * @param id  要删除的账号id
     * @return 删除成功返回true,删除失败返回false
     */
    public boolean deleteById(Integer id);
    
    /**
            *  修改账号
     * @param account 新的账号信息
     * @return 修改成功返回true，修改失败返回false
     */
    public boolean update(Account account);
    
    /**
             * 根据id得到账号
     * @param id  要查询账号的id
     * @return 查询到用户，如果数据库中没有该id，则返回null
     */
    public Account getById(Integer id);
    
    /**
              * 分页得到部分账号
     * @param page 页码
     * @param pageSize  页面数量
     * @return 根据分页信息得到的账号，如果数据中没有用户，则返回null;
     */
    public List<Account> getAll(int page,int pageSize);
    
    /**
             *     最大数据量
     * @return 返回账号最大数据量
     */
    public long getMaxCount();
    
    
}
