package bankAccount;

public class Printer {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount("Batiri Iulia ",10000.0);
        BankAccount bankAccount2 = new BankAccount("Batiri Egor ",10000.0);

        bankAccount1.showDetails();
        bankAccount2.showDetails();

        System.out.println("////depunere///////////////////////");

        //Depunere de bani
        bankAccount1.deposit(400);
        bankAccount2.deposit(300);

        System.out.println("////retragere///////////////////////");

        //Retragere de bani
        bankAccount1.withdraw(444);

        System.out.println("////transfer///////////////////////");

        //Transfer de bani
        bankAccount2.transfer(bankAccount1,123);

        System.out.println("///////////////////////////");
        System.out.println("////afisare///////////////////////");

        //Afisare date clienti
        bankAccount1.showDetails();
        bankAccount2.showDetails();
    }
}
