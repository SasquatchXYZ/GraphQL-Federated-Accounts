package com.playground.GraphQL_Federated_Accounts.service;

import com.playground.GraphQL_Federated_Accounts.domain.BankAccount;
import com.playground.GraphQL_Federated_Accounts.domain.Currency;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class BankService {

    private static final List<BankAccount> bankAccounts = Arrays.asList(
            new BankAccount(100, Currency.USD, 1500.00f, "Active"),
            new BankAccount(102, Currency.EUR, 2500.00f, "Inactive"),
            new BankAccount(103, Currency.USD, 5000.00f, "Active"),
            new BankAccount(104, Currency.EUR, 7500.00f, "Active")
    );

    public List<BankAccount> accounts() {
        return bankAccounts;
    }
}
