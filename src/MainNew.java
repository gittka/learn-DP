import main.java.model.AccountStatus;
import main.java.model.AccountType;
import main.java.model.BankAccount;
import main.java.model.Director;
      
public class MainNew {
    public static void main(String[] args) {
      BankAccount bankAccount1 = Director.builder()
                .accountId(2L)
                .accountBalance(100.0)
                .accountCurrency("USD")
                .accountStatus(AccountStatus.CREATED)
                .accountType(AccountType.CURRENT_ACCOUNT)
                .build();                                        
        
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