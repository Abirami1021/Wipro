package Abirami;

public class Throw 
{
	    public static void main(String[] args) 
	    { try
	    { int age = 5;
	        if (age < 18) 
	        {
	            throw new ArithmeticException("Too young to vote");
	        }
	    }catch(ArithmeticException e)
	    {
	    	 System.out.println(e.getMessage());
	    }
	       System.out.println("Eligible to vote");
	    
	}

}
