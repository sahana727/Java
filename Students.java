public class Students extends StudentInfo{

	String section;

	public Students(String name , int age , String branch , String section){

		this.name = name;
		this.age = age;
		this.branch = branch;
		this.section = section;
	}	

	public void printDetails(){
		System.out.println("Name = " + name);
		System.out.println("Age = " + age);
		System.out.println("Branch = " + branch);
		System.out.println("Section = " + section);
	}
}