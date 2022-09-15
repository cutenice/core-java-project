/*
     @author : Neelam Ghodake
     @Date   : 15 sep 2022
	 Program : Write a java program to print the tagline of any 5companies(Enahnced switch case)
	 */
	 import java.util.Scanner;
	 public class BtagLine 
	 {
    
     
       public static void printTagline()   // creating to method tagline
	   {

        
        Scanner sc = new Scanner(System.in);    // taking input from user
        System.out.println("Enter brand name");
        String BrandName = sc.next();

        
        switch(BrandName)
		{
		   case "Disneyland"   ->  System.out.println("The happiest place on Earth");
	       case "Nike"	    ->  System.out.println("Just do it");
           case "De Beer"	    ->  System.out.println("A diamond is forever");
           case "Samsung" ->  System.out.println("Do what you can't");
           case "BMW"	    ->  System.out.println("The ultimate driving machine");
	        default         ->  System.out.println("Brand Name is Not found");
			}
    }

    public static void main(String[] args)    
	{

        
        printTagline();         //printing tagline
    }
}