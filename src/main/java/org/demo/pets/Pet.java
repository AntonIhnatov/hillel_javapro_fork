package org.demo.pets;

public abstract class Pet extends Animal {

    public int legs;
    public int eyes;

    public abstract void setPetInfo(int legs, int eyes);
    public abstract void setAnimalInfo(String kind, String name);
    public abstract void getPetInfo();
}
