package JavaEncapsulationExercises.p02;

public class Runner {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();

        bankAccount.setAccountNumber("A01-101");
        bankAccount.setBalance(1500.0);

        String accountNumber = bankAccount.getAccountNumber();
        double balance = bankAccount.getBalance();

        System.out.println("AccountNumber = " + accountNumber);
        System.out.println("Balance = " + balance);


    }


}
