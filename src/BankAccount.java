import java.util.ArrayList;

public abstract class BankAccount {
    private int accountNumber;
    private String holderFirstName;
    private String holderLastName;
    private double balance;
    private accType accountType;
    public ArrayList<Transaction> transactions;



    public int getAccountNumber() {
        return accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public String getHolderFirstName() {
        return holderFirstName;
    }
    public String getHolderLastName() {
        return holderLastName;
    }
    public accType getAccountType() {
        return accountType;
    }

    public void addtransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public void deposit(double amount, Transaction transaction) {
        balance += amount;
        addtransaction(transaction);
    }
    public void withdraw(double amount, Transaction transaction) {
        if (balance - amount < 0) {
            System.out.println("Insufficient balance");
        }
        else {
            balance -= amount;
            addtransaction(transaction);
        }
    }

    public abstract void accInfo();

    public BankAccount(int accountNumber, String holderFirstName, String holderLastName, double balance, accType accountType) {
        this.accountNumber = accountNumber;
        this.holderFirstName = holderFirstName;
        this.holderLastName = holderLastName;
        this.balance = balance;
        this.accountType = accountType;
        this.transactions = new ArrayList<>();
    }


}
