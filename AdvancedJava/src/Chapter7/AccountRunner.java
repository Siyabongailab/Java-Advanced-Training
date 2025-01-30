package Chapter7;

public class AccountRunner {
    public static void main(String[] args) {
        Account objAccount = new Account("234432156651","iThala","Siyabonga",
                                        "Sithole",BankAccountType.Cheque,15);


        objAccount.display();
    }


}
