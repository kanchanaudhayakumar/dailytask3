package inter.org;

public class Automation extends MultipleLanguage implements Language,Testtool  {

	@Override
	public void selenium() {
		// TODO Auto-generated method stub
		System.out.println("testool is selenium");
	}

	@Override
	public void java() {
		// TODO Auto-generated method stub
		System.out.println("language java");
	}

	@Override
	public void python() {
		// TODO Auto-generated method stub
		System.out.println("multiple language python");
		
	}

	public static void main(String[] args) {
		
	
		Automation org = new Automation();
		org.java();
		org.python();
		
		org.ruby();
		org.selenium();
	}
}
