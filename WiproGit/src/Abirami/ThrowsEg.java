package Abirami;

public class ThrowsEg {
		// TODO Auto-generated method stub
		static void checkAge(int age) throws ArithmeticException 
		{
	        if (age < 18) 
	        {
	            throw new ArithmeticException("Too young to vote");
	        }
	    }

	    public static void main(String[] args) {
	        try {
	            checkAge(15);
	        } catch (ArithmeticException e) {
	            System.out.println(e.getMessage());
	        } 
	    }


}
