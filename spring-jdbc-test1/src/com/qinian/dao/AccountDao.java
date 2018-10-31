package com.qinian.dao;

import java.util.List;

import com.qinian.bean.Account;

/**
 * @author ����
 * @Description: �˺����ݷ��ʽӿڲ�
 */
public interface AccountDao {
	/**
	    * �����˺�
	 * @param account  ������˻�
	 * @return ����ɹ�����true,����ʧ�ܷ���false
	 */
    public boolean save(Account account);
    
    /**
              * ����idɾ���˺�
     * @param id  Ҫɾ�����˺�id
     * @return ɾ���ɹ�����true,ɾ��ʧ�ܷ���false
     */
    public boolean deleteById(Integer id);
    
    /**
            *  �޸��˺�
     * @param account �µ��˺���Ϣ
     * @return �޸ĳɹ�����true���޸�ʧ�ܷ���false
     */
    public boolean update(Account account);
    
    /**
             * ����id�õ��˺�
     * @param id  Ҫ��ѯ�˺ŵ�id
     * @return ��ѯ���û���������ݿ���û�и�id���򷵻�null
     */
    public Account getById(Integer id);
    
    /**
              * ��ҳ�õ������˺�
     * @param page ҳ��
     * @param pageSize  ҳ������
     * @return ���ݷ�ҳ��Ϣ�õ����˺ţ����������û���û����򷵻�null;
     */
    public List<Account> getAll(int page,int pageSize);
    
    /**
             *     ���������
     * @return �����˺����������
     */
    public long getMaxCount();
    
    
}
