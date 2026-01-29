package Abirami;

public class RunThread implements Runnable {

    public void run() {
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {

Runnable obj = new RunThread(); // Runnable object new ku aprm enn cls name vena pottuakal 
        Thread t = new Thread(obj);        // Thread created
        t.start();                         // thread starts
    }
}
