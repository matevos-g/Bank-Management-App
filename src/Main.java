public class Main {
    public static void main(String[] args) {
        Savings account1 = new Savings(00001,"John","Doe",0,accType.SAVINGS);
        Savings account2 = new Savings(00002,"Jane","Doe",0,accType.SAVINGS);
        Current account3 = new Current(00003,"Josh","Doe",0,accType.CURRENT);



        account1.deposit(100,new Transaction("000001",trsType.DEPOSIT,100));
        System.out.println(account1.getBalance());
        account1.withdraw(70,new Transaction("000002",trsType.WITHDRAWAL,70));
        System.out.println(account1.getBalance());

        account1.accInfo();
    }
}

