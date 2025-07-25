package com.example.banking_app.dto;


//public class AccountDto {
//
//    private Long id;
//    private String accountHolderName;
//    private double balance;
//
//    public AccountDto() {
//        super();
//    }
//
//    public AccountDto(Long id, String accountHolderName, double balance) {
//        this.id = id;
//        this.accountHolderName = accountHolderName;
//        this.balance = balance;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getAccountHolderName() {
//        return accountHolderName;
//    }
//
//    public void setAccountHolderName(String accountHolderName) {
//        this.accountHolderName = accountHolderName;
//    }
//
//    public double getBalance() {
//        return balance;
//    }
//
//    public void setBalance(double balance) {
//        this.balance = balance;
//    }
//
//    @Override
//    public String toString() {
//        return "AccountDto{" +
//                "id=" + id +
//                ", accountHolderName='" + accountHolderName + '\'' +
//                ", balance=" + balance +
//                '}';
//    }
//}


public record AccountDto(Long id,
                         String accountHolderName,
                         double balance){

}