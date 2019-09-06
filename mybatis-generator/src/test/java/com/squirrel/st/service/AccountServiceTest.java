package com.squirrel.st.service;

import com.alibaba.fastjson.JSON;
import com.squirrel.st.domain.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class AccountServiceTest {

    @Autowired
    private AccountService accountService;

    @Test
    public void listAccounts() {
        List<Account> list = accountService.listAccounts();
        System.out.println(JSON.toJSONString(list));
    }
}
