package Abirami;

class Parent {
    int age = 10;

    Parent(String n) {
        System.out.println("Parent Class Constructor: " + n);
    }

    void make() {
        System.out.println("HI");
    }
}

class Child extends Parent {

    Child() {
        super("Abi");        // calls Parent constructor(spr cls constr)
       super.make();        // calls Parent method(spr method)
        System.out.println("Child class constructor");
        System.out.println(super.age); // accesses Parent variable(spr variable)
    }
}

public class SupPract {
    public static void main(String[] args) {
        Child a = new Child();
    }
}
