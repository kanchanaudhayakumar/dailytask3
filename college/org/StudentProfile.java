package college.org;

public class StudentProfile extends Department {

	public void studentName()
	{
		System.out.println("name:kavianaya");
	}
	public void studentDept()
	{
		System.out.println("dep :IT");
	}
	public void	studentId()
	{
		System.out.println("id card:07");
	}

public static void main(String[] args) {
	StudentProfile obj = new  	StudentProfile();
	obj.studentName();
	obj.studentDept();
	obj.studentId();
	obj.dep();
	obj.college();
}
}
