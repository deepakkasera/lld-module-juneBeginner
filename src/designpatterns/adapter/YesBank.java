package designpatterns.adapter;

public class YesBank {
    //3rd Party class.
    void transferMoney(String from, String to, double amount) {
        System.out.println("YesBank | Sending " + amount + " from " + from + " account to " + to + " account.");
    }

    double getBalance(String accountNumber) {
        System.out.println("YesBank | Balance of " + accountNumber + " is " + 100);
        return 100;
    }
}
