package com.glwa.accountservice.repositories;

import com.glwa.accountservice.domain.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount, String> {
}
