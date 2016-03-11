package net.woniper.spring.boot.restful.example.service;

import net.woniper.spring.boot.restful.example.domain.Account;
import net.woniper.spring.boot.restful.example.repository.AccountRepository;
import net.woniper.spring.boot.restful.example.support.AccountDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    @Autowired private AccountRepository accountRepository;
    @Autowired private ModelMapper modelMapper;
    @Autowired private PasswordEncoder passwordEncoder;

    public Account newAccount(AccountDto.Request accountRequest) {
        Account newAccount = modelMapper.map(accountRequest, Account.class);
        newAccount.setPassword(passwordEncoder.encode(newAccount.getPassword()));
        return accountRepository.save(newAccount);
    }

    public Account getAccount(Long accountId) {
        return accountRepository.findOne(accountId);
    }

    public Account getAccount(String username) {
        return accountRepository.findByUsername(username);
    }

    public boolean isDuplicationUsername(String username) {
        return accountRepository.findByUsername(username) != null;
    }
}
