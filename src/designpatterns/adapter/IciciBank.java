package designpatterns.adapter;

public class IciciBank {
    void moveMoney(double amount, String from, String to) {
        System.out.println("IciciBank | Sending " + amount + " from " + from + " account to " + to + " account.");
    }

    double showBalance(String accountNumber) {
        System.out.println("IciciBank | Balance of " + accountNumber + " is " + 100);
        return 100;
    }
}
