package designpatterns.adapter;

public class PhonePe {
//    YesBank yesBank = new YesBank();
//
//    void transferMoney(String a, String b, double amount) {
//        yesBank.transferMoney(a, b, 1000);
//    }

    BankApi bankApi = new IciciAdapter();

    public void sendMoney(String acc1, String acc2, double x) {
        bankApi.sendMoney(acc1, acc2, x);
    }

    public double checkBalance(String acc) {
        return bankApi.checkBalance(acc);
    }
}
