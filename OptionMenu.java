package com.company;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;


public class OptionMenu extends Account {
    Scanner menuInput=new Scanner(System.in);
    DecimalFormat moneyformat=new DecimalFormat("'$'###,##0.00");

    HashMap<Integer, Integer> data=new HashMap<Integer, Integer>();

    public void getLogin() throws IOException {
        int x = 1;
        do {
            try {
                data.put(952141, 191904);
                data.put(989947, 71976);

                System.out.println("welcome to the ATM");
                System.out.println("Enter your customer number: ");

                setCustomerNumber(menuInput.nextInt());

                System.out.println("Enter you PIN Number: ");

                setPinNumber(menuInput.nextInt());
            } catch (Exception e) {
                System.out.println("\n" + "Invalid Character(s). Only Numbers." + "\n");
                x = 2;
            }
            int cn = getCustomerNumber();
            int pn = getPinNumber();
            if (data.containsKey(cn) && data.get(cn) == pn) {
                getAccountType();
            } else
                System.out.println("\n" + "Wrong Customer NUmber or PinNumber" + "\n");
        } while (x == 1);
    }

    public void getAccountType() {
        System.out.println("Select the Account you Want to Access: ");
        System.out.println("Type 1 - Current Account");
        System.out.println("Type 2 - Saving Account");
        System.out.println("Type 3 - Exit");

        int selection=menuInput.nextInt();

        switch(selection){
            case 1:
                getCurrent();
                break;
            case 2:
                getSaving();
                break;
            case 3:
                System.out.println("Thank You \n");
                break;

            default:
                System.out.println("\n" + "Invalid Choice." + "\n");
                getAccountType();
        }
    }
    public void getCurrent(){
        System.out.println("Current Account: ");
        System.out.println("Type 1 - View Balance");
        System.out.println("Type 2 - Withdraw Funds");
        System.out.println("Type 3 - Deposit Funds");
        System.out.println("Type 4 - Exit");
        System.out.println("Choice: ");

        int selection=menuInput.nextInt();

        switch(selection){
            case 1:
                System.out.println("Current Account Balance: " +moneyformat.format(getCurrentBalance()));
                getAccountType();
                break;
            case 2:
                getCurrentWithdrawInput();
                getAccountType();
                break;
            case 3:
                getCurrentDepositInput();
                getAccountType();
                break;
            case 4:
                System.out.println("Thank You \n");
                break;

            default:
                System.out.println("\n" + "Invalid Choice." + "\n");
                getAccountType();

        }

    }
    public void getSaving(){
        System.out.println("Saving Account: ");
        System.out.println("Type 1 - View Balance");
        System.out.println("Type 2 - Withdraw Funds");
        System.out.println("Type 3 - Deposit Funds");
        System.out.println("Type 4 - Exit");
        System.out.println("Choice: ");

        int selection=menuInput.nextInt();

        switch(selection){
            case 1:
                System.out.println("Current Account Balance: " +moneyformat.format(getSavingBalance()));
                getAccountType();
                break;
            case 2:
                getSavingWithdrawInput();
                getAccountType();
                break;
            case 3:
                getSavingDepositInput();
                getAccountType();
                break;
            case 4:
                System.out.println("Thank You \n");
                break;

            default:
                System.out.println("\n" + "Invalid Choice." + "\n");
                getAccountType();

        }

    }

}

