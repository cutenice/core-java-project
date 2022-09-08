/*
@author: Neelam Ghodake
@Date:   8 sep 2022
Program: Java program to find Quotient and Reminder(take input)
*/

      class QuotientRemainder 
	  {
    
    
       public static void main(String[] args)          // calling main method
	  {
        
        
        int divided, divisor, quotient, remainder;      // declaring variable

        
        divided = Integer.parseInt(args[0]);
        divisor = Integer.parseInt(args[1]);            // taking commmand line input

        
        quotient = divided/divisor;
        remainder = divided%divisor;                    // calculating quotient and remainder

        
        System.out.println("Quotient = "+quotient);
        System.out.println("Remainder = "+remainder);    // printing quotient and remainder
    }
}