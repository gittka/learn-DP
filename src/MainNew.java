import main.java.model.AccountStatus;
import main.java.model.AccountType;
import main.java.model.BankAccount;
import main.java.model.Director;


public class MainNew {
    public static void main(String[] args) {
        BankAccount bankAccount = Director.builder()
                .accountId(2L)
                .accountBalance(100.0)
                .accountCurrency("USD")
                .accountStatus(AccountStatus.CREATED)
                .accountType(AccountType.CURRENT_ACCOUNT)
                .build();
    }
}