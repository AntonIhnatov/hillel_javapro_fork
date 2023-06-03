package org.demo.pets;

public final class Cat extends Pet implements Behavior {
    public String furColor;
    public int claws;

    public Cat(String kind, String name, int legs, int eyes, String furColor, int claws){
        setAnimalInfo(kind, name);
        setPetInfo(legs, eyes);
        this.furColor = furColor;
        this.claws = claws;
    }
    public void setAnimalInfo(String kind, String name){
        super.kind = kind;
        super.name = name;
    }
    public void setPetInfo(int legs, int eyes){
        super.legs = legs;
        super.eyes = eyes;
    }
    public void getPetInfo(){
        System.out.println("Kind: " + super.kind);
        System.out.println("Name: " + super.name);
        System.out.println("Legs: " + super.legs);
        System.out.println("Eyes: " + super.eyes);
        System.out.println("Fur color: " + this.furColor);
        System.out.println("Claws: " + this.claws);
    }

    public void makeSound() {
        System.out.println("Meow meow");
    }
    public void sleep() {
        System.out.println("Zzz");
    }
}

