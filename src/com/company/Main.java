package com.company;

public class Main {

    public static void main(String[] args) {
        KitchenRoom kuxnya = new KitchenRoom("sos",2,"Холодильник");
        kuxnya.print();
        GuestRoom room = new GuestRoom("pop",1,"divan");
        room.print();
        WashRoom wash = new WashRoom("Vanna",1,2);
        wash.print();
        Printable[] printables  = {kuxnya,room,wash};

        createObject("Kitchen").print();
        createObject("Guset").print();
        createObject("Wash").print();

    }

    public static Printable createObject(String className) {
        Printable printable = null;
        switch (className) {
            case "Kitchen":
                printable = new KitchenRoom("sos",2,"Холодильник");
                break;
            case "Guset":
                printable = new GuestRoom("pop",1,"divan");
                break;
            case "Wash":
                printable = new WashRoom("Vanna",1,2);
                break;
        }
        return printable;
    }

}
