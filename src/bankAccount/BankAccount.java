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

    //Metoda pentru retragerea banilor
    public void withdraw(double value){
        if (value > 0){
            if(sold >= value){
                sold -= value;
                System.out.println("  Suma de " + value + " afost retrasa. Sold actual:: " + sold);
            }
            else {
                System.out.println("  Fonduri insuficiente !!! Sold disponibil:: " + sold);
            }
        }
        else {
            System.out.println("  Suma trebuie sa fie mai mare de 0 !!!");
        }
    }

    //Metoda de transfer a banilor altui cont

    public String getAddressee(){
        return head;
    }
    
    public void transfer(BankAccount addressee, double value){
        if (value > 0) {
            if (sold >= value) {
                sold -= value;
                addressee.deposit(value);
                System.out.println("  Suma de " + value + " a fost depusa catre:: " +
                addressee.getAddressee());
            }
            else{
                System.out.println("!!! Fonduri insuficiente pentru transfer. Sold disponibil: " + sold);
            }
        }
    }
    
    //Metoda pentru afisare detaliilor contului
    public void showDetails(){
        System.out.println("  Titular: " + head + "\n Sold: " + sold + "\n\n");
    }
     


}
