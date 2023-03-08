package main.java.repository;

import main.java.model.BankAccount;

import java.util.List;
import java.util.Optional;

public interface AccountRepository {
    BankAccount save(BankAccount bankAccount);
    List<BankAccount> findAll();
    Optional<BankAccount> findById(Long id);

}
