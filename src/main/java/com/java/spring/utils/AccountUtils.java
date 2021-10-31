package com.java.spring.utils;

import com.java.spring.entity.Bill;
import com.java.spring.entity.Account;
import com.java.spring.exceptions.NotDefaultBillException;

public class AccountUtils {

    public static Bill findDefaultBill(Account accountFrom) {
        return accountFrom.getBills().stream()
                .filter(Bill::getDefault)
                .findAny()
                .orElseThrow(() -> new NotDefaultBillException("Unable to find default bill for account with id: "
                        + accountFrom.getAccountId()));
    }
}
