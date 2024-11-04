public class DeviCollege extends College{
	
	int noOfCourses;

	public DeviCollege(Principal principal , HOD[] hod , Professors[] professors , Students[] students , int noOfCourses){

		super(principal,hod , professors , students);
		this.noOfCourses = noOfCourses;
	}
	public void printDetails(){

		System.out.println("SHREE DEVI COLLEGE DETAILS");
		
			System.out.println("\n--------------Principal details-----------------\n");
			principal.printDetails();

		for(int i = 0; i<hod.length; i++){
			System.out.println("\n---------------hod details----------------------\n");
			hod[i].printDetails();
		}

		for(int i = 0; i<professors.length; i++){
			System.out.println("\n----------------Professors details--------------------\n");
			professors[i].printDetails();
		}

		for(int i = 0; i<students.length; i++){
			System.out.println("\n------------------Students details--------------------\n");
			students[i].printDetails();
		}

		System.out.println("Number of courses present in college:"+noOfCourses);
		
	}
}