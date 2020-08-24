package vehicleTypes;

import vehicleInterface.Vehicle;

public class Moped implements Vehicle, Cloneable {

    private String name = "Moped";
    private String color = "blue";


    private int weight = 90;
    private int fuel = 5;

    public Moped(){}

    public Moped(String name, String color){
        this.name = name;
        this.color = color;
    }

    @Override
    public Object clone() {
        return new Moped(name, color);
    }

    @Override
    public String toString() {
        return "Moped {" +
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
        fuel -= 1;
        System.out.println("Moped is riding. Fuel left: " + fuel);
    }

    @Override
    public void refill() {
        fuel += 3;
        System.out.println("Moped fuel is refilled. Fuel left: " + fuel);
    }
}
