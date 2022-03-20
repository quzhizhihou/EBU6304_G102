package lab_1;

public class Bank extends CurrentAccount{

	public Bank(int number, String name,double balance) {
		super(number, name, 0);
		// TODO Auto-generated constructor stub
	}
	public void deleteAccount()
	{
		setNumber(0);
		setName(null);
		setBalance(0);
	}
	public void checkBalance()
	{
		System.out.println("your balance is :"+getBalance());
	}
	public void CCwithdraw(double number)
	{
		if(getBalance()-number<-500)
		{
			System.out.println("you do not have enough money");
		}
		else
		{
			setBalance(getBalance()-number);
		}
		checkBalance();
	}
}
