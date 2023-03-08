package main.java.repository;

import main.java.model.BankAccount;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class AccountRepositoryImpl implements AccountRepository {
    @Override
    public BankAccount save(BankAccount bankAccount) {
        return null;
    }

    @Override
    public List<BankAccount> findAll() {
        return null;
    }

    @Override
    public Optional<BankAccount> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<BankAccount> findAccounts(Predicate<BankAccount> predicate) {
        return null;
    }

    @Override
    public BankAccount update(BankAccount bankAccount) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
