package com.bt_akademi.transaction_management.controller;

import com.bt_akademi.transaction_management.model.service.AbstractTransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionController
{
    @Autowired
    AbstractTransactionService transactionService;
}
