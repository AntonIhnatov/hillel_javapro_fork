package org.demo.cars;

public final class HybridCar extends Car implements TurnLights{
    private static final String ENGINETYPE = "HYBRID";
    public int lights;

    public HybridCar(int lights){
        this.lights = lights;
    }
    public void getCarInfo(){
        System.out.println("Manufacturer: " + super.manufacturer);
        System.out.println("Model: " + super.model);
        System.out.println("Engine type: " + ENGINETYPE);
        System.out.println("Lights: " + lights);
        super.getVehicleWheels();
    }
    public void setCarInfo(String manufacturer, String model, int frontWheels, int rearWheels){
        super.manufacturer = manufacturer;
        super.model = model;
        super.frontWheels = frontWheels;
        super.rearWheels = rearWheels;
    }
    public void leftTurnLight(){
        System.out.println("Left turn light");
    }
    public void rightTurnLight(){
        System.out.println("Right turn light");
    }
    public void lightsOn(){
        System.out.println("Lights is on");
    }
    public void lightsOff(){
        System.out.println("Lights is off");
    }

}
