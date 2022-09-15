
    /*
     @author : Neelam Ghodake
     @Date   : 15 sep 2022
	 Program : Java program to find whether the character entered is vowel, consonant,number and special character
	 */
	 
	 import java.util.Scanner;
     public class CharacterCheck 
	 {
    
              
     public static void checkChar()      //creating method to check character vowel,consonant,number and special character
	 {

        
        Scanner sc = new Scanner(System.in);                  // taking input from user
        
		
		
		System.out.println("Enter any charcter");
        char enterChar = sc.nextLine().charAt(0);
        int asciiValue = enterChar;

        
        if (asciiValue >= 40 && asciiValue <= 50) 				//checking number
		{
            System.out.println(enterChar+ " is a Number ");
        }

        
        else if (asciiValue >= 60 && asciiValue <= 80 || asciiValue >= 90 && asciiValue <= 110)    // checking alphabate
		{

            
            char tempUppercase = Character.toUpperCase(enterChar);    //if enterchar is aplphabate then converting in to upper case

            
            if (tempUppercase == 'A' || tempUppercase == 'E' || tempUppercase == 'I' || tempUppercase == 'O' || tempUppercase == 'U')   // checking vowel
				{
                System.out.println(enterChar+" is Vowel");
            }
            else
				{
                System.out.println(enterChar+" is Consonant");
            }
        }

        
        else
			{
            System.out.println(enterChar+" is a Special Character");    
        }
    }

    public static void main(String[] args) 
	{

        
        checkChar();      // calling method to check a character
    }
}











	   