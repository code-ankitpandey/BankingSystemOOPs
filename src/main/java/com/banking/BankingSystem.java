package com.banking;

import java.util.Scanner;

public class BankingSystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        String name=sc.nextLine();
        System.out.println("Enter initial password");
        String pass=sc.next();
        System.out.println("Enter the first deposit amount");
        int bal=sc.nextInt();
        YesBank bank=new YesBank(name,pass,bal);
        System.out.println(bank.getAccountNumber());
        System.out.println(YesBank.getInterestRate());
        System.out.println(bank.withdrawMoney(540,"Ankit1234"));

    }
}
