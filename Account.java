package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {

    private int customerNumber;
    private int pinNumber;
    private double CurrentBalance=0;
    private double SavingBalance=0;

    Scanner menuInput=new Scanner(System.in);
    DecimalFormat moneyformat=new DecimalFormat("'$'###,##0.00");

    public int setCustomerNumber(int customerNumber){
        this.customerNumber = customerNumber;
        return customerNumber;
    }

    public int getCustomerNumber(){
        return customerNumber;

    }

    public int setPinNumber(int pinNumber){
        this.pinNumber = pinNumber;
        return pinNumber;
    }

    public int getPinNumber(){
        return pinNumber;
    }

    public double getCurrentBalance(){
        return CurrentBalance;
    }

    public double getSavingBalance(){
        return SavingBalance;
    }

    public double calcCurrentWithdraw(double amount) {
        CurrentBalance = (CurrentBalance-amount);
        return CurrentBalance;
    }

    public double calcSavingWithdraw(double amount) {
        SavingBalance = (SavingBalance-amount);
        return SavingBalance;
    }

    public double calcCurrentDeposit(double amount) {
        CurrentBalance = (CurrentBalance+amount);
        return CurrentBalance;
    }

    public double calcSavingDeposit(double amount) {
        SavingBalance = (SavingBalance+amount);
        return SavingBalance;
    }

    public void getCurrentWithdrawInput(){
        System.out.println("Current Account Balance: " +moneyformat.format(CurrentBalance));
        System.out.println("Account you Want to withdraw from current Acc0unt: ");
        double amount = menuInput.nextDouble();

        if((CurrentBalance-amount) >= 0){
            calcCurrentWithdraw(amount);
            System.out.println("new Current Account Balance: " +moneyformat.format(CurrentBalance));

        }else{
            System.out.println("Balance cannot be Negative." + "\n");
        }
    }

    public void getCurrentDepositInput(){
        System.out.println("Current Account Balance: " +moneyformat.format(CurrentBalance));
        System.out.println("Account you Want to Deposit from current Account: ");
        double amount = menuInput.nextDouble();

        if((CurrentBalance+amount) >= 0){
            calcCurrentDeposit(amount);
            System.out.println("new Current Account Balance: " +moneyformat.format(CurrentBalance));

        }else{
            System.out.println("Balance cannot be Negative." + "\n");
        }
    }

    public void getSavingWithdrawInput(){
        System.out.println("saving Account Balance: " +moneyformat.format(SavingBalance));
        System.out.println("Account you Want to withdraw from Saving Account: ");
        double amount = menuInput.nextDouble();

        if((SavingBalance-amount) >= 0){
            calcSavingWithdraw(amount);
            System.out.println("new saving Account Balance: " +moneyformat.format(SavingBalance));

        }else{
            System.out.println("Balance cannot be Negative." + "\n");
        }
    }

    public void getSavingDepositInput(){
        System.out.println("Saving Account Balance: " +moneyformat.format(SavingBalance));
        System.out.println("Account you Want to Deposit from Saving Account: ");
        double amount = menuInput.nextDouble();

        if((SavingBalance+amount) >= 0){
            calcSavingDeposit(amount);
            System.out.println("new Saving Account Balance: " +moneyformat.format(SavingBalance));

        }else{
            System.out.println("Balance cannot be Negative." + "\n");
        }
    }


}
