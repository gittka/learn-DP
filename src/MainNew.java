import main.java.adapter.client.AudioPlayer;
import main.java.model.AccountStatus;
import main.java.model.AccountType;
import main.java.model.BankAccount;

public class MainNew {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount().builder()
                .accountId(1L)
                .accounCurrency("USD")
                .accountStatus(AccountStatus.CREATED)
                .accountType(AccountType.SAVING_ACCOUNT)
                .accountBalance(1000.0)
                .build();
        System.out.printf(bankAccount.toString());
    }
}