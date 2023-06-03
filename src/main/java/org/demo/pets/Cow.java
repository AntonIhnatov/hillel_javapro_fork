package org.demo.pets;

public final class Cow extends Pet{
    public String breed;
    public int hooves;

    public Cow(String kind, String name, int legs, int eyes, String breed, int hooves){
        setAnimalInfo(kind, name);
        setPetInfo(legs, eyes);
        this.breed = breed;
        this.hooves = hooves;
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
        System.out.println("Breed: " + this.breed);
        System.out.println("Hooves: " + this.hooves);
    }
}
