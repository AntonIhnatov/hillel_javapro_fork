package org.demo.cars;

public final class GasolineCar extends Car implements Window{
    private static final String ENGINETYPE = "GASOLINE";
    public int doors;

    public GasolineCar(int doors){
        this.doors = doors;
    }
    public void getCarInfo(){
        System.out.println("Manufacturer: " + super.manufacturer);
        System.out.println("Model: " + super.model);
        System.out.println("Engine type: " + ENGINETYPE);
        System.out.println("Doors: " + doors);
        super.getVehicleWheels();
    }
    public void setCarInfo(String manufacturer, String model, int frontWheels, int rearWheels){
        super.manufacturer = manufacturer;
        super.model = model;
        super.frontWheels = frontWheels;
        super.rearWheels = rearWheels;
    }
    public void openFrontWindow() {
        System.out.println("Front window is opened");
    }
    public void openRearWindow() {
        System.out.println("Rear window is opened");
    }
}
