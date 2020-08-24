package repository;

import vehicleInterface.Vehicle;
import vehicleTypes.Car;
import vehicleTypes.Truck;
import vehicleTypes.Motorcycle;
import vehicleTypes.Moped;
import iterator.Aggregate;
import iterator.Iterator;


public class VehiclePool implements Aggregate {

    private Vehicle vehicles[] = {new Moped(), new Car(), new Truck(), new Motorcycle()};

    @Override
    public Iterator getIterator() {
        return new VehicleIterator();
    }


    private class VehicleIterator implements Iterator {

        private int index = 0;

        @Override
        public boolean hasNext() {
            if(index < vehicles.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return vehicles[index++];
        }
    }
}