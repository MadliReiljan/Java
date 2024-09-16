package ex86;

public class Main {
    public static void main(String[] args) {
        LyyraCard cardOfPekka = new LyyraCard(10);

        System.out.println("money on the card " + cardOfPekka.balance());
        boolean succeeded = cardOfPekka.pay(8);
        System.out.println("money taken: " + succeeded);
        System.out.println("money on the card " + cardOfPekka.balance());

        succeeded = cardOfPekka.pay(4);
        System.out.println("money taken: " + succeeded);
        System.out.println("money on the card " + cardOfPekka.balance());
    }
}

class LyyraCard {
    private double balance;

    public LyyraCard(double balance) {
        this.balance = balance;
    }

    public double balance() {
        return this.balance;
    }

    public void loadMoney(double amount) {
        this.balance += amount;
    }

    public boolean pay(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            return true;
        }
        return false;
    }
}