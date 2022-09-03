// Lab 09 Q2.	Write a program with a mother class and an inherited daugther class. Both of them should have a 
// method void display ()that prints a message (different for mother and daugther). In the main define a daughter and call the display() method on it

class mother {
    void display() {
        System.out.println("This is " + getClass());
    }
}

class daughter extends mother {
    void display() {
        System.out.println("This is " + getClass());
    }
}

public class Task2 {
    public static void main(String[] args) {
        // daughter d = new daughter();
        mother d = new mother();
        d.display();
    }
}
