package labtest13oct;

public class UserException_main {
	public static void main(String args[]){
		try{
			System.out.println("Starting of try block");
			// I'm throwing the custom exception using throw
			throw new UserException("This is My error Message");
		}
		catch(UserException exp){
			System.out.println("Catch Block") ;
			System.out.println(exp) ;
		}
	   }

}
