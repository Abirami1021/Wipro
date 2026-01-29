package Abirami;

public class ATM {

    synchronized void withdraw(String name) {
        System.out.println(name + " is withdrawing money");
        try {
            Thread.sleep(2000);
        } catch (Exception e) {}

        System.out.println(name + " Withdrawal completed");
    }

    public static void main(String[] args) {

        ATM atm = new ATM();

        // Runnable for User-1 detailed lambda
        /*Runnable r1 = new Runnable() {
            public void run() {
                atm.withdraw("User-1");
            }
        };

        // Runnable for User-2
        Runnable r2 = new Runnable() {
            public void run() {
                atm.withdraw("User-2");
            }
        };*/
       
        
        new Thread(() -> atm.withdraw("User-1")).start();

        new Thread(()->atm.withdraw("User-2")).start();
        Thread t1 = new Thread();
        Thread t2 = new Thread();

        t1.start();
        t2.start();
    }
}
