package designpatterns.adapter;

public interface BankApi {
    //Created by PP.
    double checkBalance(String accountNumber);

    void sendMoney(String from, String to, double amount);
}
