public class Parameter{
	
	public static void main(String[] args){
    email(10,"sanu@gmail.com");
    email(11,"ammu@gmail.com");
    email(12,"anu@gmail.com");
    phoneCall(67457835,"sahana",91);
    phoneCall(63637867,"mahima",967);
    phoneCall(87456382,"pratu",917);
    login("sanu@gmail.com","sanu727");
    login("ammu@gmail.com","ammu788");
    login("anu@gmail.com","anu12345");
    
	}
	public static void email(int id, String subject)
	{
	System.out.println("emailid:"+id+"\nSubject:"+subject);	
	}

    public static void phoneCall(int mobNum, String name, int countryCode)
	{
	System.out.println("mobile Num:"+mobNum+"\nName"+name+"\nCountrycode"+countryCode);	
	}

	public static void login( String email, String password)
	{
	System.out.println("email address:"+email+"\npassword:"+password);	
	}

	
}