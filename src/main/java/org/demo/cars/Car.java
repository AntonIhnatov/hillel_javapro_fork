package org.demo.cars;

public abstract class Car extends Vehicle{
    public String manufacturer;
    public String model;

    public void getVehicleWheels() {
        System.out.println("Front wheels: " + super.frontWheels);
        System.out.println("Rear wheels " + super.rearWheels);
    }
    public abstract void getCarInfo();
    public abstract void setCarInfo(String manufacturer, String model, int frontWheels, int rearWheels);
}
