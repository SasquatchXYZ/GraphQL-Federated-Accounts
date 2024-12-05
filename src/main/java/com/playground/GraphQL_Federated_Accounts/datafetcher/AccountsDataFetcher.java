package com.playground.GraphQL_Federated_Accounts.datafetcher;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import com.playground.GraphQL_Federated_Accounts.domain.BankAccount;
import com.playground.GraphQL_Federated_Accounts.service.BankService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@DgsComponent
@Slf4j
public class AccountsDataFetcher {
    @Autowired
    BankService accountsService;

    @DgsQuery
    public List<BankAccount> accounts() {
        log.info("Getting Accounts");
        return accountsService.accounts();
    }
}
