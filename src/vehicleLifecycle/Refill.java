package vehicleLifecycle;

import vehicleInterface.Vehicle;


public class Refill implements Command {

    private Vehicle vehicle;

    public Refill(Vehicle vehicle){
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        vehicle.refill();
    }
}
