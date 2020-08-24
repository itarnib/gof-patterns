package vehicleTypes;

import vehicleInterface.Vehicle;

public class Car implements Vehicle, Cloneable {

    private String name = "Car";
    private String color = "black";


    private int weight = 1200;
    private int fuel = 50;

    public Car(){}

    public Car(String name, String color){
        this.name = name;
        this.color = color;
    }

    @Override
    public Object clone() {
        return new Car(name, color);
    }

    @Override
    public String toString() {
        return "Car {" +
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
        fuel -= 3;
        System.out.println("Car is riding. Fuel left: " + fuel);
    }

    @Override
    public void refill() {
        fuel += 30;
        System.out.println("Car fuel is refilled. Fuel left: " + fuel);
    }
}
