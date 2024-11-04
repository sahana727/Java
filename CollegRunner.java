public class CollegRunner{

	public static void main(String[] args) {

		Principal principal1 = new Principal("Santhosh", 70, 150000, 7);

		HOD hod1 = new HOD("Saniha", 30, 70000, "Computer Science");
		HOD hod2 = new HOD("Pavan", 35, 55000, "Electronics");

		HOD[] head1 = {hod1, hod2};


		Professors professor1 = new Professors("Sahana", 24, 30000, "DS");
		Professors professor2 = new Professors("Mahima", 30, 25000, "Python");
		Professors professor3 = new Professors("Janu", 25, 30000, "Maths");
		
		Professors[] prof1 = {professor1, professor2, professor3};


		Students students1 = new Students("sanvi", 20, "Computer Science" , "A");
		Students students2 = new Students("manvi", 19, "Computer Science", "B");
		Students students3 = new Students("thanvi", 20, "Electronics", "A");
		Students students4 = new Students("karan", 21, "Computer Science", "A");
		Students students5 = new Students("kevin", 20, "Electronics", "B");
		
		Students[] stud1 = {students1,students2, students3, students4, students5};



		DeviCollege devi = new DeviCollege(principal1, head1, prof1, stud1, 4);
		devi.printDetails();



		Principal principal2 = new Principal("Dinesh", 65, 200000, 8);

		HOD hod3 = new HOD("Mamatha", 40, 60000, "MCA");
		HOD hod4 = new HOD("Savitha", 35, 45000, "MBA");

		HOD[] head = {hod3, hod4};


		Professors professor4 = new Professors("Janavi", 35, 40000, "java");
		Professors professor5 = new Professors("Thanvika", 28, 30000, "Python");
		Professors professor6 = new Professors("Prathik", 25, 25000, "Accounts");
		
		Professors[] prof = {professor4, professor5, professor6};


		Students students6 = new Students("manu", 22, "MCA","A");
		Students students7 = new Students("anu", 23, "MCA", "B");
		Students students8 = new Students("thanu", 22, "MBA", "B");
		Students students9 = new Students("saanu", 23, "MBA", "A");
	
		Students[] stud = {students6, students7, students8, students9};



		CanaraCollege canara  = new CanaraCollege(principal2, head, prof, stud, 2);
		canara.printDetails();

		
	}
}