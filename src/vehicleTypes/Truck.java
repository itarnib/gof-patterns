package vehicleTypes;

import vehicleInterface.Vehicle;

public class Truck implements Vehicle, Cloneable {

    private String name = "Truck";
    private String color = "white";


    private int weight = 8000;
    private int fuel = 600;

    public Truck(){}

    public Truck(String name, String color){
        this.name = name;
        this.color = color;
    }

    @Override
    public Object clone() {
        return new Truck(name, color);
    }

    @Override
    public String toString() {
        return "Truck {" +
                "name='" + name + "', " +
                "color='" + color + "'}";
    }

    @Override
    public String getType() {
        return name;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public void ride() {
        fuel -= 20;
        System.out.println("Truck is riding. Fuel left: " + fuel);
    }

    @Override
    public void refill() {
        fuel += 100;
        System.out.println("Truck fuel is refilled. Fuel left: " + fuel);
    }
}
