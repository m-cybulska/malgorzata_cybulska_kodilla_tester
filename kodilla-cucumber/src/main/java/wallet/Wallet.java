package wallet;

public class Wallet {
    private int balance = 0;
    private String errorMessage;

    public Wallet() {
    }

    public void deposit(int money) {
        this.balance += money;
    }

    public int getBalance() {
        return balance;
    }

    public void withdraw(int money) {
        if (money <= balance) {
            this.balance -= money;
            errorMessage = "";
        } else {
            errorMessage = "Cannot withdraw more than the balance";
        }
    }

    public void setErrorMessage(String message) {
        this.errorMessage = message;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
