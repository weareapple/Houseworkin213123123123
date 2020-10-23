package com.company;

public class KitchenRoom  extends House implements  Printable{
     private String furniture;

    public KitchenRoom(String name, int doors, String furniture) {
        super(name, doors);
        this.furniture = furniture;
    }
    @Override
    public  void print() {
        System.out.println("furnuture =" + furniture +
                "\nname =" + getDoors() +
                "\ndoors =" + getName());

    }
}
