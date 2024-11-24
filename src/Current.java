public class Current extends BankAccount {

    private double overdraftLimit;

    public Current(int accountNumber, String holderFirstName, String holderLastName, double balance, accType accountType) {
        super(accountNumber, holderFirstName, holderLastName, balance, accountType);

        this.overdraftLimit = overdraftLimit;
    }

    public void accInfo() {
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Holder First Name: " + getHolderFirstName());
        System.out.println("Holder Last Name: " + getHolderLastName());
        System.out.println("Balance: " + getBalance());
        System.out.println("Account Type: " + getAccountType());
        System.out.println("Overdraft Limit: " + overdraftLimit);
        System.out.println("Transactions: ");
        for (int i = 0; i < transactions.size(); i++) {
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("Transaction ID: " + transactions.get(i).getTransactionID());
            System.out.println("Transaction Type: " + transactions.get(i).getTransactionType());
            System.out.println("Transaction Amount: " + transactions.get(i).getAmount());
        }
        System.out.println("-----------------------------------------------------------------------------");
    }
}
