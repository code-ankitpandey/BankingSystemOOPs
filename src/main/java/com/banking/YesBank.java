package com.banking;


import java.util.UUID;

public class YesBank implements Bank {

   private String password;
   private float balance;
   final static int interestRate=5;
   private String accountNo;
   private String name;

    public YesBank(String name,String password,int bal) {
        this.password = password;
        this.name=name;
        this.accountNo = UUID.randomUUID().toString();
        this.balance=bal;
    }

    @Override
    public String showBalance(String password) {
        if(this.password.equals(password))
            return "Balance ="+this.balance;
        return "Invalid password";
    }
    @Override
    public String withdrawMoney(int money,String password) {
      if (this.password.equals(password)){
            if (this.balance<money) {
                return "Insufficient funds";
            }
            else{
                balance-=money;
                return money+" withrawl succesfully, remaining balance is "+balance;
            }
      }
      else {
          return "Invalid Password";
      }
    }

    public static int getInterestRate() {
        return interestRate;
    }
    @Override
    public void depositMoney(int money){
        this.balance+=money;
    }
    @Override
    public String getAccountNumber(){
        return this.accountNo;
    }
}
