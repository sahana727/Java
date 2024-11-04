public class HOD extends StaffInfo{

	String departmentName;

	public HOD(String name , int age , int salary , String departmentName){

		this.name = name;
		this.age = age;
		this.salary = salary;
		this.departmentName = departmentName;
	}	

	public void printDetails(){
		System.out.println("Name = " + name);
		System.out.println("Age = " + age);
		System.out.println("Salary = " + salary);
		System.out.println("Department Name = " + departmentName);
	}
}