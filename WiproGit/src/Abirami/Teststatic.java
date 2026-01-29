package Abirami;

class Student {
    int num;
    String name;
    static String college = "AKP College"; // shared for all

    Student(int num, String name) {
        this.num = num;
        this.name = name;
    }

    void display() {
        System.out.println(num + " " + name + " " + college);
    }
}

public class Teststatic {
    public static void main(String[] args) {

        Student s1 = new Student(1, "Abi");
        Student s2 = new Student(2, "Ashu");

        s1.display();
        s2.display();
    }
}
