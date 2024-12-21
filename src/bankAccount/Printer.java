package bankAccount;

public class Printer {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount("Batiri Iulia ",10000.0);
        BankAccount bankAccount2 = new BankAccount("Batiri Egor ",10000.0);

        bankAccount1.showDetails();
        bankAccount2.showDetails();
    }
}
