package com.playground.GraphQL_Federated_Accounts.domain;

public record BankAccount(Integer id, Currency currency, Float balance, String status) {
}
