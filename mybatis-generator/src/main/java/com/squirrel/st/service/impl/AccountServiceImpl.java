package com.squirrel.st.service.impl;

import com.squirrel.st.domain.Account;
import com.squirrel.st.domain.AccountExample;
import com.squirrel.st.mapper.AccountMapper;
import com.squirrel.st.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class AccountServiceImpl implements AccountService {

    private final AccountMapper accountMapper;

    public AccountServiceImpl(AccountMapper accountMapper) {
        this.accountMapper = accountMapper;
    }

    @Override
    public List<Account> listAccounts() {
        AccountExample example = new AccountExample();
        return accountMapper.selectByExample(example);
    }
}
