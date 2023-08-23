package bank;

public class AxisBank extends BankInfo {

	public void deposit()
	{
		System.out.println("my fixed price 2000");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AxisBank obj =new AxisBank();
		obj.saving();
		obj.fixed();
		obj.deposit();

	}

}
