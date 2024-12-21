package car;

public class Printer {

    public static void main(String[] args) {
        Car car = new Car("Opel", "Mokka", 250);
        car.showDetails();
        //Accelerare
        car.speedUp(90);
        car.speedUp(200);
        //Frinare
        car.speedDown(40);
        car.speedDown(40);
        car.speedDown(40);
        car.speedDown(40);
        car.showDetails();

    }



}
