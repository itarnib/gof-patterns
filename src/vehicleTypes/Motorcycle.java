package vehicleTypes;

import vehicleInterface.Vehicle;

public class Motorcycle implements Vehicle, Cloneable {

    private String name = "Motorcycle";
    private String color = "red";


    private int weight = 300;
    private int fuel = 15;

    public Motorcycle(){}

    public Motorcycle(String name, String color){
        this.name = name;
        this.color = color;
    }

    @Override
    public Object clone() {
        return new Motorcycle(name, color);
    }

    @Override
    public String toString() {
        return "Motorcycle {" +
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
        fuel -= 2;
        System.out.println("Motorcycle is riding. Fuel left: " + fuel);
    }

    @Override
    public void refill() {
        fuel += 10;
        System.out.println("Motorcycle fuel is refilled. Fuel left: " + fuel);
    }
}
