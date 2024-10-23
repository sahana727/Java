public class Bank{
	
	String bankName;
	String branch;
	int bankIFSCcode;
	String manager;

	public Bank(){

		System.out.println("No param constructor");
	}

	public Bank(String bankName,String branch,int bankIFSCcode,String manager){

		this.bankName = bankName;
		this.branch = branch;
		this.bankIFSCcode = bankIFSCcode;
		this.manager = manager;
	}

	public static void mortageLoans(){

	}

	public static void insurence(){

	}

	public static void fundsCreditCards(){

	}

	public void bankDetails(){

		System.out.println("Bank Name : "+bankName);
		System.out.println("branch : "+branch);
		System.out.println("Bank IFSC code : "+bankIFSCcode);
		System.out.println("manager : "+manager);
	}
}