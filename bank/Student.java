package bank;

public class Student {
	public void  info(int x, String name)
	{
		System.out.println("ID NUMBER :" +x);
		System.out.println("NAME     :" +name);
	
	}
	public void inform(int x,String email)
	{
		System.out.println("PHONE:" +x);
		System.out.println("EMAILID    :" +email);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student obj1 = new Student();
		obj1.info(07,"kavinaya");
		obj1.inform(978948, "kavi@gmail.com");
		
		
	}

}
