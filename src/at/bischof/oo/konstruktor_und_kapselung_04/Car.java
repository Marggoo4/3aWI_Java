// Füge eine Methode break() ein. Die Methode gibt den String "Ich bremse" aus.
// Füge eine Methode turboBoost() ein. Diese Methode prüft ob der Benzinstand größer als 10% des Tankvolumens ist.
// Wenn ja gibt die Methode den Text "SuperBoostMode" aus. Ansonsten wird "Not enough fuel to go to Superboost".
//
// Füge eine Methode honk(int amountOfRepetitions) ein.
// Die Methode honk hupt (gibt auf der Konsole den Text "Tuuut" aus.
// Über den Parameter amountOfRepetitions kann gesteuert werden wie oft gehupt wird.
//
// Füge eine Methode getRemainingRange() ein.
// Diese Methode liefert die Rest-Reichweite des Autos zurück.
// Diese wird berechnet über den Tankstand und den Verbrauch.


package at.bischof.oo.konstruktor_und_kapselung_04;

public class Car  {

    private double tankCapacity;
    private double fuelLevel;
    private double fuelConsumption;


    public Car (double tankCapacity, double fuelLevel, double fuelConsumption) {
        this.tankCapacity = tankCapacity;
        this.fuelLevel = fuelLevel;
        this.fuelConsumption = fuelConsumption;
    }



    public void applyBrakes () {
        System.out.println("Ich bremse");
    }

    public void turboBoost() {
        if (fuelLevel > (0.1 * tankCapacity)) {
            System.out.println("SuperBoostMode");
        } else {
            System.out.println("Not enough fuel to go to Superboost");
        }
    }

    public void honk(int amountOfRepetitions) {
        for (int i = 0; i < amountOfRepetitions; i++) {
            System.out.println("Tuuut");
        }
    }

    public void getRemainingRange() {
        double range = (fuelLevel / fuelConsumption) * 100;
        System.out.println("Restreichweite: " + range + " km");
    }

    public void drive() {
        this.fuelLevel = fuelLevel - fuelConsumption;
        System.out.println("I am driving");
    }



    public void setTankCapacity(double tankCapacity) {
        if (tankCapacity > 100) {
            System.out.println("Tank kann nicht über 100 Liter sein.");
            this.tankCapacity = 100;

        } else {
            this.tankCapacity = tankCapacity;
        }
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }




    public double getTankCapacity() {
        return tankCapacity;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

}
