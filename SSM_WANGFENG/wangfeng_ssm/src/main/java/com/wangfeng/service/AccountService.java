package com.wangfeng.service;

import com.wangfeng.domain.Account;

import java.util.List;

/**
 * 账户服务层接口
 */
public interface AccountService {

    public void save(Account account);

    public void deleteById(Integer id);

    public void deleteByUid(Integer uid);

    public Account findAccountById(Integer id);

    public List<Account> findAll();

    public List<Account> findAllAccount();

    public void updateAccountById(Account account);



}
