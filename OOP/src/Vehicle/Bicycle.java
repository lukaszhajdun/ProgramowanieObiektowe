package Vehicle;

public class Bicycle implements IVehicle {
    @Override
    public void drive(int speed) {
        speed = 15;
        System.out.println("Jedę sobie rowerem, bawię się nowym licznikiem");
        System.out.println("Jadę "+ speed +" km/h");
    }

    @Override
    public void stop() {
        System.out.println("");

    }
}
