/*
@author :Neelam Ghodake
@Date   :18 sep 2022
Program :Tagline
*/
public class TagLine
{
	//Giving a method name
	static void printTagline(String tagline)
	{
		//Switch case started
		switch(Brandname){
			//If the abbrevation is AWQL
		case "AWQL" ->System.out.println("Absent without leave");
		//If the abbrevation is ASAP
		case "ASAP" ->System.out.println("As soon as possible");
		//If the abbrevation is CAL
		case "CAL" -> System.out.println("Calculate");
		//If the abbrevation is GMT
		case "GMT" -> System.out.println("Greenwich mean time");
		//If the abbrevation is IRS
		case "IRS" -> System.out.println("Internal Revenue Service");
		
		default -> System.out.println("Sorry this tagline is wrong");
		}
	}
	
	//Calling the main method
	public static void main (String args[])
	{
		printTagline(args[0].toUpperCase()); //Any input user will give it will convert to Uppercase
	}
}