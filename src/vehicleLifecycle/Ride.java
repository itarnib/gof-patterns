package vehicleLifecycle;

import vehicleInterface.Vehicle;

public class Ride implements Command {

    private Vehicle vehicle;

    public Ride(Vehicle vehicle){
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        vehicle.ride();
    }
}
