package com.company;

public class WashRoom extends House implements  Printable{
    private int mirror;

    public WashRoom(String name, int doors, int mirror) {
        super(name, doors);
        this.mirror = mirror;
    }
    @Override
        public  void print() {
            System.out.println("name =" + getName()+
                    "\ndoors =" + getDoors() +
                    "\nmirror =" + mirror);
    }
}
