/*
@author: Neelam Ghodake
@Date:   8 sep 2022
Program: Write a java program to calculate simple intrest(SI=PxRxt).
*/
  
      class SimpleIntrest
	  {
	        
        static void calSimpleInterest(int p, double rate, double time)   // creating method to calculate simple interest 
	   {
		
		double simpleInterest = (p*rate* time)/ 100;                     // calculating simple interest

        
        System.out.println("Simple Interest = "+simpleInterest);     // printing of the simple interest

    }
    
         public static void main(String[] args) 
		 {
           double rate = Double.parseDouble(args[0]);
           double time = Double.parseDouble(args[1]);                // taking command line input

        
           calSimpleInterest(10000, rate, time);                     // calling method to calculate simple interest 
    }
}