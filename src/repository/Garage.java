package repository;

import vehicleInterface.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Garage implements Vehicle {

    private List<Vehicle> vehicleList = new ArrayList<>();

    public void addVehicle(Vehicle vehicle){
        vehicleList.add(vehicle);
    }
    public void removeVehicle(Vehicle vehicle){
        vehicleList.remove(vehicle);
    }


    @Override
    public String getType() {
        StringBuilder builder = new StringBuilder();
        builder.append("Types of vehicles in the garage: ");
        for (Vehicle vehicle : vehicleList){
            builder.append(vehicle.getType() + ", ");
        }
        return builder.toString();
    }

    @Override
    public String getColor() {
        StringBuilder builder = new StringBuilder();
        builder.append("Colors of vehicles in the garage: ");
        for (Vehicle vehicle : vehicleList){
            builder.append(vehicle.getColor() + ", ");
        }

        return builder.toString();
    }

    @Override
    public int getWeight() {
        int totalWeight = 0;
        for (Vehicle vehicle : vehicleList) {
            totalWeight += vehicle.getWeight();
        }
        return totalWeight;
    }

    @Override
    public void ride() {

    }

    @Override
    public void refill() {

    }
}
