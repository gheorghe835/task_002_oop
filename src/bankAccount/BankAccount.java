package bankAccount;

public class BankAccount {
    private  String head;
    private double sold;

    public BankAccount(String head, double sold) {
        this.head = head;
        this.sold = sold;
    }
    //Metoda de depunere banilor in cont
    public void deposit(double value){
        if (value > 0){
            sold += value;
            System.out.println(" Suma de:: " + value + " a fost depusa. Soldul actual:: " + sold);
        }
        else {
            System.out.println("  Suma trebuie sa fie mai mare de 0 !!!");
        }
    }


}
