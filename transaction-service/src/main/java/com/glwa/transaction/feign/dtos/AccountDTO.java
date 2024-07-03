package com.glwa.transaction.feign.dtos;

import com.glwa.transaction.enums.AccountStatus;

import java.math.BigDecimal;
import java.util.Date;

public record AccountDTO(String id, BigDecimal balance, Date createdAt, AccountStatus status,
                         Long customerId, double overDraft, double interestRate) { }
