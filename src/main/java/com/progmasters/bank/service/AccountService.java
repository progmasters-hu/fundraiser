package com.progmasters.bank.service;

import com.progmasters.bank.domain.Account;
import com.progmasters.bank.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AccountService {

    @Autowired
    AccountRepository accountRepository;

    public void create(Account account) {
        accountRepository.save(account);
    }

    public Account findByIpAddress(String ipAddress) {
        return accountRepository.findByIpAddress(ipAddress);
    }

    public Account findOne(Long id) {
        return accountRepository.findOne(id);
    }

    public List<Account> findAll() {
        return accountRepository.findAll();
    }

    public Account findMyAccount(String ipAddress) {
        return findByIpAddress(ipAddress);
    }
}
