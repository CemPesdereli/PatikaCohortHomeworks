package org.example.homework_1;

public class House {
    protected String type;
    protected double price;
    protected double area;
    protected int numberOfRooms;
    protected int numberOfLivingRooms;

    public House(String type, double price, double area, int numberOfRooms, int numberOfLivingRooms) {
        this.type = type;
        this.price = price;
        this.area = area;
        this.numberOfRooms = numberOfRooms;
        this.numberOfLivingRooms = numberOfLivingRooms;
    }

    public double getPrice() {
        return price;
    }

    public double getArea() {
        return area;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public int getNumberOfLivingRooms() {
        return numberOfLivingRooms;
    }

    @Override
    public String toString() {
        return type + " - Price: " + price + ", Area: " + area + ", Rooms: " + numberOfRooms + ", Living Rooms: " + numberOfLivingRooms;
    }
}
