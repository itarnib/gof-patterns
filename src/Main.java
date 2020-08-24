import repository.Garage;
import vehicleLifecycle.Refill;
import vehicleLifecycle.Ride;
import vehicleLifecycle.Lifecycle;
import vehicleTypes.Car;
import vehicleTypes.Moped;
import vehicleTypes.Motorcycle;
import vehicleTypes.Truck;
import convertor.WeightInPoundsConverter;
import iterator.Iterator;
import repository.VehiclePool;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println("-----command-----");
        main.testCommand();
        System.out.println("-----adapter-----");
        main.testAdapter();
        System.out.println("-----iterator-----");
        main.testIterator();
        System.out.println("-----composite-----");
        main.testComposite();
        main.testPrototype();
    }

    void testCommand() {
        Moped moped = new Moped();
        Ride ride = new Ride(moped);
        Refill refill = new Refill(moped);
        Lifecycle lifecycle = new Lifecycle(ride);
        Lifecycle lifecycle2 = new Lifecycle(refill);
        lifecycle.executeCommand();
        lifecycle2.executeCommand();
    }

    void testAdapter() {
        Car car = new Car();
        WeightInPoundsConverter weightInPoundsConverter = new WeightInPoundsConverter(car);
        System.out.println(weightInPoundsConverter.getWeightInPounds());
    }

    void testIterator() {
        VehiclePool vehiclePool = new VehiclePool();
        Iterator iterator = vehiclePool.getIterator();

        while (iterator.hasNext()) {
            System.out.println("Current Vehicle = " + iterator.next());
        }
    }

    void testComposite() {
        Moped moped1 = new Moped();
        Moped moped2 = new Moped();
        Moped moped3 = new Moped();

        Car car1 = new Car();
        Car car2 = new Car();

        Truck truck1 = new Truck();

        Motorcycle motorcycle1 = new Motorcycle();
        Motorcycle motorcycle2 = new Motorcycle();
        Motorcycle motorcycle3 = new Motorcycle();

        Garage garage1 = new Garage();
        Garage garage2 = new Garage();

        garage1.addVehicle(moped1);
        garage1.addVehicle(moped2);
        garage1.addVehicle(car1);
        garage1.addVehicle(truck1);
        garage1.addVehicle(motorcycle1);

        garage2.addVehicle(moped3);
        garage2.addVehicle(car2);
        garage2.addVehicle(motorcycle2);

        System.out.println("All colors in the garage1:");
        System.out.println(garage1.getColor());

        garage1.removeVehicle(truck1);

        System.out.println("All colors after removing truck1 from garage1");
        System.out.println(garage1.getColor());

        System.out.println("All types in the garage2:");
        System.out.println(garage2.getType());
    }

    void testPrototype() {
        Motorcycle motorcycle1 = new Motorcycle();
        Motorcycle motorcycle2 = (Motorcycle) motorcycle1.clone();
        Motorcycle motorcycle3 = (Motorcycle) motorcycle2.clone();
    }
}
