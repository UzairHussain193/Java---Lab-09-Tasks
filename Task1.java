// Lab 09 Q1.	Create a multilevel inheritance hierarchy with a parent interface vehicle containing methods accelerate
//  and decelerate, private properties: color, weight, model, with their setter and getters. Then the sub interfaces
//   Bus, Truck, Car further extending classes SchoolBus, HondaCar, VigoTruck, with their implementation respectively.

import javax.print.attribute.standard.MediaSize.Engineering;

interface Car {
    public void accelerate(int speed1);

    public void decelerate(int speed2);

    public void setColor(String c);

    public String getColor();

    public void setEngine(int e);

    public int getEngine();

    public void setRegno(int m);

    public int getRegno();

}

interface Bus {
    public void accelerate(int speed1);

    public void decelerate(int speed2);

    public void setColor(String s);

    public String getColor();

    public void setEngine(int eng);

    public int getEngine();

    public void setRegno(int reg);

    public int getRegno();

}

interface Truck {
    public void accelerate(int speed1);

    public void decelerate(int speed2);

    public void setColor(String s);

    public String getColor();

    public void setEngine(int eng);

    public int getEngine();

    public void setRegno(int reg);

    public int getRegno();

}

class vehicle1 implements Car {

    public String clr;
    public int engineno;
    public int regno;

    @Override
    public void accelerate(int sp) {
        System.out.println("Car's Speed accelerated." + sp);
    }

    public void decelerate(int sp2) {
        System.out.println("Car's Speed decelerated." + sp2);
    }

    public void setColor(String c) {
        clr = c;
    }

    public String getColor() {
        return clr;
    }

    public void setEngine(int eg) {
        engineno = eg;
    }

    public int getEngine() {
        return engineno;
    }

    public void setRegno(int rg) {
        regno = rg;
    }

    public int getRegno() {
        return regno;
    }

}

class HondaCar extends vehicle1 {

}

class vehicle2 implements Truck {

    public String colour;
    public int engno;
    public int regtno;

    @Override
    public void accelerate(int sp) {
        System.out.println("Truck's Speed accelerated." + sp);
    }

    public void decelerate(int sp2) {
        System.out.println("Truck's Speed decelerated." + sp2);
    }

    public void setColor(String c) {
        colour = c;
    }

    public String getColor() {
        return colour;
    }

    public void setEngine(int eg) {
        engno = eg;
    }

    public int getEngine() {
        return engno;
    }

    public void setRegno(int rg) {
        regtno = rg;
    }

    public int getRegno() {
        return regtno;
    }

}

class VigoTruck extends vehicle2 {

}

class vehicle3 implements Bus {

    public String clr;
    public int engineno;
    public int regno;

    @Override
    public void accelerate(int sp) {
        System.out.println("Bus's Speed accelerated." + sp);
    }

    public void decelerate(int sp2) {
        System.out.println("Bus's Speed decelerated." + sp2);
    }

    public void setColor(String c) {
        clr = c;
    }

    public String getColor() {
        return clr;
    }

    public void setEngine(int eg) {
        engineno = eg;
    }

    public int getEngine() {
        return engineno;
    }

    public void setRegno(int rg) {
        regno = rg;
    }

    public int getRegno() {
        return regno;
    }

}

class SchoolBus extends vehicle3 {

}

class Task1 {
    public static void main(String[] args) {
        vehicle1 b1 = new vehicle1();
        vehicle2 b2 = new vehicle2();
        vehicle3 b3 = new vehicle3();
        /// prinitng cars attributes and methods
        System.out.println("\t\tPrinitng attributes and methods for car interface\n");
        b1.accelerate(20);
        b1.decelerate(10);
        b1.setColor("Red");
        b1.setEngine(2017);
        b1.setRegno(8943);
        System.out.println(b1.getColor());
        System.out.println(b1.getEngine());
        System.out.println(b1.getRegno());
        /// prinitng trucks attributes and methods
        System.out.println("\t\tPrinitng attributes and methods for trucks interface\n");
        b2.accelerate(30);
        b2.decelerate(50);
        b2.setColor("Blue");
        b2.setEngine(2012);
        b2.setRegno(4455);
        System.out.println(b2.getColor());
        System.out.println(b2.getEngine());
        System.out.println(b2.getRegno());
        /// prinitng bus attributes and methods
        System.out.println("\t\tPrinitng attributes and methods for bus interface\n");
        b3.accelerate(60);
        b3.decelerate(40);
        b3.setColor("Black");
        b3.setEngine(2014);
        b3.setRegno(1199);
        System.out.println(b3.getColor());
        System.out.println(b3.getEngine());
        System.out.println(b3.getRegno());

        System.out.println("\t\tPrinitng attributes and methods for extended subclass hondacar \n");
        HondaCar h1 = new HondaCar();
        h1.setColor("White");
        h1.setEngine(10000);
        h1.setRegno(00010);
        System.out.print("Acceleration: ");
        h1.accelerate(200);
        System.out.print("Deceleration: ");
        h1.decelerate(35);

        System.out.println(h1.getColor());
        System.out.println(h1.getEngine());
        System.out.println(h1.getRegno());

        System.out.println("\t\tPrinitng attributes and methods for extended subclass VigoTruck \n");

        VigoTruck v1 = new VigoTruck();

        v1.setColor("Black Vigo");
        v1.setEngine(50000);
        v1.setRegno(9999);
        System.out.print("Acceleration: ");
        v1.accelerate(600);
        System.out.print("Deceleration: ");
        v1.decelerate(120);

        System.out.println(v1.getColor());
        System.out.println(v1.getEngine());
        System.out.println(v1.getRegno());

        System.out.println("\t\tPrinitng attributes and methods for extended subclass School Bus \n");

        SchoolBus s1 = new SchoolBus();

        s1.setColor("Sky Blue School Bus");
        s1.setEngine(80000);
        s1.setRegno(9829);
        System.out.print("Acceleration: ");
        s1.accelerate(400);
        System.out.print("Deceleration: ");
        s1.decelerate(200);

        System.out.println(s1.getColor());
        System.out.println(s1.getEngine());
        System.out.println(s1.getRegno());

    }
}