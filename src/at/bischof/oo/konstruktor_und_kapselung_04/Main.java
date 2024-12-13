package at.bischof.oo.konstruktor_und_kapselung_04;



public class Main {
    public static void main(String[]args) {



        Car myCar = new Car(110, 50, 4);
        myCar.applyBrakes();
        myCar.turboBoost();
        myCar.honk(3);
        myCar.getRemainingRange();

        System.out.println(myCar.getTankCapacity());
        System.out.println(myCar.getFuelLevel());
        System.out.println(myCar.getFuelConsumption());








        /*
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

         */
    }
}
