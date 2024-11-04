public class Principal extends StaffInfo{

	int yearOfExperience;

	public Principal(String name , int age , int salary , int yearOfExperience){

		this.name = name;
		this.age = age;
		this.salary = salary;
		this.yearOfExperience = yearOfExperience;
	}	

	public void printDetails(){
		System.out.println("Name = " + name);
		System.out.println("Age = " + age);
		System.out.println("Salary = " + salary);
		System.out.println("Year of experience = " + yearOfExperience);
	}
}