package designpatterns.adapter;

public class YesBankAdapter implements BankApi {
    //Created by PP.
    YesBank yesBank = new YesBank();
    @Override
    public double checkBalance(String accountNumber) {
        return yesBank.getBalance(accountNumber);
    }

    @Override
    public void sendMoney(String from, String to, double amount) {
        yesBank.transferMoney(from, to, amount);
    }
}
