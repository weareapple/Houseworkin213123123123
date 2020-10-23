package com.company;

public class GuestRoom extends House implements Printable {
    private  String sofa;

    public GuestRoom(String name, int doors, String sofa) {
        super(name, doors);
        this.sofa = sofa;
    }

    @Override
    public  void print() {
        System.out.println("sofa =" + sofa +
                "\nname =" + getName() +
                "\ndoors =" + getDoors());
    }
}
