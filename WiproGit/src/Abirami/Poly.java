package Abirami;

public class Poly 
{
int add(int a,int b)
{
	return a+b;
}
double add(double a,double b)
{
	return a+b;
}
int add(int a,int b,int c)
{
	return a+b+c;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Poly p=new Poly();
System.out.println(p.add(2,3));
System.out.println(p.add(2.5,3.1));
System.out.println(p.add(8,1,2));
	}

}
