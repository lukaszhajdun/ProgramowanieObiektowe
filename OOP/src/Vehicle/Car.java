package Vehicle;


public class Car implements IVehicle {

    @Override
    public void drive(int speed) {
        speed = 170;
        System.out.println("Samochód jedzie z prędkością " + speed);
        System.out.println("Zwolnij chłopie!!!");
    }

    @Override
    public void stop() {
        System.out.println("Samochod sie zatrzymał.");
    }

    public void drift(){
        System.out.println("Samochód driftuje");
    }
}
