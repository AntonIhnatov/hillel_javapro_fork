import org.demo.cars.*;
import org.demo.pets.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Cars");

        System.out.println();

        GasolineCar gasolineCar = new GasolineCar(2);
        gasolineCar.setCarInfo("Mercedes", "Actros", 2, 6);
        gasolineCar.getCarInfo();
        gasolineCar.openFrontWindow();
        gasolineCar.openRearWindow();

        System.out.println();

        ElectricCar electricCar = new ElectricCar(110);
        electricCar.setCarInfo("Nissan", "Leaf", 2, 2);
        electricCar.getCarInfo();

        System.out.println();

        HybridCar hybridCar = new HybridCar(4);
        hybridCar.setCarInfo("VW", "E-Golf", 2, 2);
        hybridCar.getCarInfo();
        hybridCar.rightTurnLight();
        hybridCar.leftTurnLight();
        hybridCar.lightsOn();
        hybridCar.lightsOff();

        System.out.println();

        System.out.println("Pets");

        System.out.println();

        Cat cat = new Cat("Cat", "Klyaksa", 4, 2 , "Brown", 10);
        cat.getPetInfo();
        cat.makeSound();
        cat.sleep();

        System.out.println();

        Cow cow = new Cow("Cow", "Burenka", 4 ,2, "Holstein-Frisian", 4);
        cow.getPetInfo();

        System.out.println();

        Spider spider = new Spider("Spider", "Vasya", 8, 24, true, 5);
        spider.getPetInfo();
        spider.walk();
        spider.leftTurn();
        spider.run();
        spider.rightTurn();

        System.out.println();

        Pet spider1 = new Spider("Spider", "Petya", 7, 24, true, 3);
        spider1.setPetInfo(5, 12);
        spider1.getPetInfo();

        System.out.println();

        Car car = new HybridCar(4);
        car.setCarInfo("Nissan", "Rouge", 2, 2);
        car.getCarInfo();
    }
}