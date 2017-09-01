package Vehicle;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Bicycle bicycle = new Bicycle();

        ArrayList<IVehicle> list = new ArrayList<>();
        list.add(car);
        list.add(bicycle);


        for (IVehicle pojazd : list) {
//            pojazd.
        }

    }
}
