package designpatterns.adapter;

public class IciciAdapter implements BankApi {
    IciciBank iciciBank = new IciciBank();
    @Override
    public double checkBalance(String accountNumber) {
        return iciciBank.showBalance(accountNumber);
    }

    @Override
    public void sendMoney(String from, String to, double amount) {
        iciciBank.moveMoney(amount, from, to);
    }
}
