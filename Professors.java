public class Professors extends StaffInfo{

	String subjectName;

	public Professors(String name , int age , int salary , String subjectName){

		this.name = name;
		this.age = age;
		this.salary = salary;
		this.subjectName = subjectName;
	}	

	public void printDetails(){
		System.out.println("Name = " + name);
		System.out.println("Age = " + age);
		System.out.println("Salary = " + salary);
		System.out.println("Name of the subject = " + subjectName);
	}
}