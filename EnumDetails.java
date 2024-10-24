public class EnumDetails{
	public static void main(String[] args) {
		
		EnumExamples exampleData = new EnumExamples(FlightStatus.DELAY ,BloodGroup.O_POSITIVE,Days.SUNDAY,ResultType.PASS,Currency.INR);
		exampleData.printdetails();
	}
}