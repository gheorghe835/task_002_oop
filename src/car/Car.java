package car;

public class Car {
    private String brand;
    private String model;
    private int speedMax;
    private int speedNow;

    public Car(String brand, String model, int speedMax) {
        this.brand = brand;
        this.model = model;
        this.speedMax = speedMax;
        this.speedNow = 0;
    }
    // Metodă pentru accelerare
    public void speedUp(int value){
        if(value > 0){
            speedNow += value;
            if(speedNow > speedMax){
                speedNow = speedMax;
            }
            System.out.println("  Masina a accelerat. Viteza curenta :: " + speedNow + " km/h." );
        }
        else{
            System.out.println("Valoarea pentru accelerare trebuie să fie pozitivă.");
        }
    }

      // Metodă pentru frânare
      public void speedDown(int value){
        if (value > 0) {
            speedNow -= value;
            if (speedNow < 0) {
                speedNow = 0;
            }
            System.out.println("Mașina a frânat. Viteza curentă: " + speedNow);
        }
        else{
            System.out.println(" valoarea pentru frinare trebuie sa fie pozitiva");
        }
      }

       // Metodă pentru afișarea detaliilor despre mașină
       public void showDetails(){
        System.out.println("  Marca: " + brand + "\n Model: " + model + 
        "\n Viteza maxima: " + speedMax + " km/h. \n Viteza curenta: " + speedNow);
       }

}
