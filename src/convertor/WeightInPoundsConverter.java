package convertor;

import vehicleInterface.Vehicle;

public class WeightInPoundsConverter implements WeightInPoundsCalculator {

    Vehicle vehicle;

    public WeightInPoundsConverter(Vehicle vehicle){
        this.vehicle = vehicle;
    }
    @Override
    public String getWeightInPounds() {
        double weightInPounds = (vehicle.getWeight() * 2.2046226218);
        return String.valueOf(weightInPounds);
    }
}
