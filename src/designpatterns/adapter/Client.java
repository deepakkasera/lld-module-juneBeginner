package designpatterns.adapter;

public class Client {
    public static void main(String[] args) {
        PhonePe phonePe = new PhonePe();

        phonePe.sendMoney("Deepak's", "Vijaya's", 1000);
        phonePe.checkBalance("Deepak's account");
    }
}
