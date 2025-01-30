package Chapter7;

import java.util.Scanner;

/**
 * class to hold attributes and methods related to account
 */

enum BankAccountType{
    Savings,
    Cheque,
    credit,
    loan

}

public class Account {

    private String AccountNumber;
    private String Name, branchCode;
    private String Surname, bankName;
    private BankAccountType AccountType;
    private double balance;

    /**
     * constructor method to create a bank account of a user
     * @param AccNum account number
     * @param BankName bank name
     * @param Name name of the owner of the account
     * @param Surname surname of the owner of the account
     * @param accType Account type
     * @param balance owners bank balance
     */
    public Account(String AccNum,String BankName, String Name, String Surname, BankAccountType accType, double balance){

        this.AccountNumber=AccNum;
        this.bankName =BankName;
        this.Name=Name;
        this.Surname = Surname;
        this.AccountType=accType;
        this.balance = balance;

     //display();
    }


    public String getAccountNumber() {
        return this.AccountNumber;
    }

    /**
     * change account number
     * @param accountNumber
     */
    public void setAccountNumber(String accountNumber) {
        this.AccountNumber = accountNumber;
    }

    /**
     * return the account type
     * @return
     */
    public BankAccountType getAccountType() {
        return AccountType;
    }

    /**
     * change the account type to new one
     * @param accountType
     */
    public void setAccountType(BankAccountType accountType) {
        AccountType = accountType;
    }

    /**
     * get name of the owner of the account
     * @return
     */
    public String getName() {
        return Name;
    }

    /**
     * change the name of the owner of the account
     * @param name
     */
    public void setName(String name) {
        Name = name;
    }

    /**
     * get the branch code
     * @return
     */
    public String getBranchCode() {
        return branchCode;
    }

    /**
     * get the surname of the owner of the account
     * @return
     */
    public String getSurname() {
        return Surname;
    }

    /**
     * change the surname of the account
     * @param surname
     */
    public void setSurname(String surname) {
        Surname = surname;
    }


    /**
     * get the bank balance of the owner
     * @return
     */
    public double getBalance() {
        return balance;
    }

    /**
     * method to facilitate the withdrawal functionality
     * @param Amount
     */
    public void Withdrawal(double Amount){

        this.balance = this.balance - Amount;

    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * method to facilitate the deposite of money into the account
     * @param Amount
     */
    public void deposit(double Amount){

        this.balance = this.balance + Amount;

    }

    /**
     *  sets balance according to the type of account
     * @return balance
     */

    public double assignbalance(){

        if(AccountType.equals(BankAccountType.Savings)){
            setBalance(0);
        }else if (AccountType.equals(BankAccountType.loan)){
            setBalance(2500);
        }else if(AccountType.equals(BankAccountType.credit)){

            setBalance(7500);
        } else if (AccountType.equals(BankAccountType.Cheque)) {
            setBalance(0);

        }

        return balance;
    }

    public void Transfer(double TAmount, Account Account){
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the account you want to transfer to: ");







        if(balance>=TAmount){

            Withdrawal(TAmount);
            setBalance(balance);


        }else
        {
            System.out.println("insufficient balance.");
        }

    }




    void display(){

        System.out.println("Account No:: " + AccountNumber);
        System.out.println("Bank: " + bankName);
        System.out.println("Name: " + Name);
        System.out.println("Surname " + Surname);
        System.out.println("Type " + AccountType.name());
        System.out.println("balance " + assignbalance());


    }

}




