package Abirami;

class Acc
{
	private int amount;

public void setAmount(int amount)
{
	this.amount=amount;
}
public int getAmount()
{
	return amount;
}
}
public class Bankacc {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Acc a=new Acc();
		a.setAmount(10002);
		if(a.getAmount()>1000)
		{
			System.out.println("Withdrwa amount: "+a.getAmount());
		}
		else
		{
			System.out.println("Deposit: "+a.getAmount());
		}

	}

}
