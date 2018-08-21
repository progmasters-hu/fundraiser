package com.progmasters.bank.repository;

import com.progmasters.bank.domain.Account;
import com.progmasters.bank.domain.Transfer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransferRepository extends JpaRepository<Transfer, Long> {

    List<Transfer> findAllByFrom(Account from);

    List<Transfer> findAllByTo(Account to);

    List<Transfer> findAllByFromOrTo(Account from, Account to);
}
