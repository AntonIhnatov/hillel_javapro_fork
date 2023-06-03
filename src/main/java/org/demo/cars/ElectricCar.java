package org.demo.cars;

public final class ElectricCar extends Car{
    private static final String ENGINETYPE = "ELECTRIC";
    public int power;

    public ElectricCar(int power){
        this.power = power;
    }
    public void getCarInfo(){
        System.out.println("Manufacturer: " + super.manufacturer);
        System.out.println("Model: " + super.model);
        System.out.println("Engine type: " + ENGINETYPE);
        System.out.println("Power: " + power);
        super.getVehicleWheels();
    }
    public void setCarInfo(String manufacturer, String model, int frontWheels, int rearWheels){
        super.manufacturer = manufacturer;
        super.model = model;
        super.frontWheels = frontWheels;
        super.rearWheels = rearWheels;
    }
}
