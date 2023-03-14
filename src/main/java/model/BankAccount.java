package main.java.model;

public class BankAccount {
    private Long accountId;
    private double balance;
    private String currency;
    private AccountType type;
    private AccountStatus status;

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public AccountType getType() {
        return type;
    }

    public void setType(AccountType type) {
        this.type = type;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }

    public BankAccount() {
    }

    public BankAccount(Long accountId, double balance, String currency, AccountType type, AccountStatus status) {
        this.accountId = accountId;
        this.balance = balance;
        this.currency = currency;
        this.type = type;
        this.status = status;
    }

    @Override
    public String   toString() {
        return "BankAccount{" +
                "accountId=" + accountId +
                ", balance=" + balance +
                ", currency='" + currency + '\'' +
                ", type=" + type +
                ", status=" + status +
                '}';
    }

    public static BankAccountBuilder builder(){
        return new BankAccountBuilder();
    }
    public static class BankAccountBuilder{
        private BankAccount bankAccount = new BankAccount();

        public BankAccountBuilder accountId(Long accountId){
            bankAccount.setAccountId(accountId);
            return this;
        }
        public BankAccountBuilder accounCurrency(String currency){
            bankAccount.setCurrency(currency);
            return this;
        }
        public BankAccountBuilder accountBalance(double balance){
            bankAccount.setBalance(balance);
            return this;
        }
        public BankAccountBuilder accountType(AccountType type){
            bankAccount.setType(type);
            return this;
        }
        public BankAccountBuilder accountStatus(AccountStatus status){
            bankAccount.setStatus(status);
            return this;
        }
        public BankAccount build(){
            return bankAccount;
        }
    }
}