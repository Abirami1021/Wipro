package Abirami;

public class PracExcep {

    public static void main(String[] args) {

        int a = 1, b = 2, c = 0;

        System.out.println(a + b + c);
        System.out.println(a - b - c);
        System.out.println(a * b * c);

        try 
        {
            System.out.println(a / c);
        } 
        catch (ArithmeticException e) 
        {
            System.out.println("Exception name: " + e);
        }

        try 
        {
            int arr[] = {1, 2, 3, 4};
            System.out.println(arr[6]);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception name: " + e);
        }
    }
}
