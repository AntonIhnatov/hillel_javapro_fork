package org.demo.pets;

public final class Spider extends Pet implements Turning{
    public boolean spiderWeb;
    public int bodyLength;

    public Spider(String kind, String name, int legs, int eyes, boolean spiderWeb, int bodyLength){
        setAnimalInfo(kind, name);
        setPetInfo(legs, eyes);
        this.spiderWeb = spiderWeb;
        this.bodyLength = bodyLength;
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
        System.out.println("Spider web: " + this.spiderWeb);
        System.out.println("Body length: " + this.bodyLength);
    }
    public void walk() {
        System.out.println("Spider is walking");
    }
    public void run() {
        System.out.println("Spider is running");
    }
    public void rightTurn() {
        System.out.println("Spider is turning right");
    }
    public void leftTurn() {
        System.out.println("Spider is turning left");
    }
}
