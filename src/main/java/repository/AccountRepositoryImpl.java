package main.java.repository;

import main.java.model.BankAccount;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class AccountRepositoryImpl implements AccountRepository {
    private Map<Long, BankAccount> accounts = new HashMap<>();
    private long accountsCount = 0;
    @Override
    public BankAccount save(BankAccount bankAccount) {
        Long accountId = accountsCount++;
        bankAccount.setAccountId(accountId);
        accounts.put(accountId, bankAccount);
        return bankAccount;
    }

    @Override
    public List<BankAccount> findAll() {
        return accounts.values().stream().toList();
    }

    @Override
    public Optional<BankAccount> findById(Long id) {
        BankAccount bankAccount = accounts.get(id);
        if (bankAccount != null) {
            return Optional.of(bankAccount);
        }
        return Optional.empty();
    }

    @Override
    public List<BankAccount> findAccounts(Predicate<BankAccount> predicate) {
        return accounts.values().stream().filter(predicate).collect(Collectors.toList());

    }

    @Override
    public BankAccount update(BankAccount bankAccount) {
        return accounts.put(bankAccount.getAccountId(), bankAccount);
    }

    @Override
    public void deleteById(Long id) {
        accounts.remove(id);
    }
}