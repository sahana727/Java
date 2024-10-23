public class BankInfo{
	
	public static void main(String[] args){

		Bank bank1 = new Bank("Canara Bank","Koramangala",123,"vishvanath shet");
        
        Bank bank2 = new Bank("Axis Bank","Banashankari",250,"Kavitha shetty");

        Bank bank3 = new Bank("Karnataka Bank","Indhiranagara",1230,"Ganesh.p");

        Bank bank4 = new Bank("Bank of Baroda","Udupi",546,"gajanana");

        Bank bank5 = new Bank("Canara Bank","vijaynagara",654,"santhosh ");

        Bank bank6 = new Bank("Kotak Bank","rajajinagara",325,"Hemesh");

        Bank bank7 = new Bank("syndicate Bank","Koramangala",130,"kamalesh p s");

        Bank bank8 = new Bank();

        Bank bank9 = new Bank();

        Bank bank10 = new Bank();


        bank1.bankDetails();
        System.out.println("******************************************");

        bank2.bankDetails();
        System.out.println("******************************************");

        bank3.bankDetails();
        System.out.println("******************************************");

        bank4.bankDetails();
        System.out.println("******************************************");

        bank5.bankDetails();
        System.out.println("******************************************");

        bank6.bankDetails();
        System.out.println("******************************************");

        bank7.bankDetails();
        System.out.println("******************************************");
        


	}
}