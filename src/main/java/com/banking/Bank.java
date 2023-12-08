package com.banking;

public interface Bank {
    public String showBalance(String password);
    public String withdrawMoney(int money,String password);

    public String getAccountNumber();
    public void depositMoney(int money);
}
