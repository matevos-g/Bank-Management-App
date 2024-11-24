public class Transaction {
    private String transactionID;
    private trsType transactionType;
    private double amount;
    public Transaction(String transactionID, trsType transactionType, double amount) {
        this.transactionID = transactionID;
        this.transactionType = transactionType;
        this.amount = amount;
    }

    public String getTransactionID() {
        return transactionID;
    }
    public trsType getTransactionType() {
        return transactionType;
    }
    public double getAmount() {
        return amount;
    }


}
