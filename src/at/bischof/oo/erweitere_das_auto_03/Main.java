package at.bischof.oo.erweitere_das_auto_03;

public class Main {
    public static void main(String[]args) {

        Car c1 = new Car();
        c1.tankCapacity = 80;
        c1.fuelLevel = 60;
        c1.fuelConsumption = 5;


        c1.applyBrakes();
        c1.turboBoost();
        c1.honk(3);
        c1.getRemainingRange();


        System.out.println(c1.fuelLevel);
        c1.drive();
        System.out.println(c1.fuelLevel);


    }
}
