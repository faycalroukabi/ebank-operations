package com.glwa.accountservice.dtos;

import java.math.BigDecimal;

public record SaveCurrentAccountDTO(BigDecimal initialBalance, double overDraft, String customerId) { }
