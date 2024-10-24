
public class EnumExamples{

	
	FlightStatus status;
	BloodGroup bloodgroup ;
	Days days;
	ResultType resulttype;
	Currency currency;
	
	

	public EnumExamples(FlightStatus status,BloodGroup bloodgroup ,Days days ,ResultType resulttype ,Currency currency){

		this.status=status;
		this.bloodgroup=bloodgroup;
		this.days=days;
		this.resulttype=resulttype;
		this.currency=currency;
		
		
	}

	public void printdetails(){
		
		System.out.println(status);
		System.out.println(bloodgroup);
		System.out.println(days);
		System.out.println(resulttype);
		System.out.println(currency);
		
	}

}
