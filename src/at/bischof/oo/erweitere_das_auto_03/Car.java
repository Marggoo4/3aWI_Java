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


package at.bischof.oo.erweitere_das_auto_03;

public class Car {

    public double tankCapacity;
    public double fuelLevel;
    public double fuelConsumption;


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

}
