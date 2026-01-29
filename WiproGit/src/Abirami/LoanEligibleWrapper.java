package Abirami;
import java.util.*;

public class LoanEligibleWrapper {

    public static void main(String[] args) {

        // Wrapper collections (Autoboxing)
        ArrayList<Integer> age = new ArrayList<>();
        age.add(25);
        age.add(17);
        age.add(35);

        ArrayList<Integer> score = new ArrayList<>();
        score.add(750);
        score.add(600);
        score.add(820);

        ArrayList<Double> income = new ArrayList<>();
        income.add(25000.0);
        income.add(15000.0);
        income.add(50000.0);

        System.out.println("Loan Eligibility Check\n");

       // Unboxing
        for (int i = 0; i < age.size(); i++) {

            int ag = age.get(i);          // Integer → int 
            int sc = score.get(i);        // Integer → int
            double inc = income.get(i);   // Double → double

            System.out.println("Person " + (i+1));

            if (ag > 21 && sc > 700 && inc > 20000) 
            {
                System.out.println("Loan Approved!!--You got it");
            } 
            else
            {
                System.out.println("Loan Rejected--Sorry");
            }

            System.out.println();
        }
    }
}
