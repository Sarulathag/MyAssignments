package week3.week3day1assignment;

public class AxisBank extends BankInfo
{
	public void bankName()
	{
		System.out.println("Bank Name : AxisBank");
	}
	
	public void deposit()
	{
		System.out.println("Deposit Method ----> called from AxisBank");
	}
	
	public static void main(String[] args)
	{
		AxisBank ab = new AxisBank();
		ab.bankName();
		ab.saving();
		ab.fixed();
		ab.deposit();
		
		BankInfo bi = new BankInfo();
		bi.deposit();
	}
}
