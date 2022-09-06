/*
 Program: Average of 3 subjects:
 @author: Neelam Ghodake
 @Date: 6 sep 2022
 */
 
   //declaring a class
   class AverageDemo
   {
      //calling main method
	  
	  public static void main(String[] args)
	  {
	      float marks1= Float.parseFloat(args[0]);
          float marks2= Float.parseFloat(args[1]);
          float marks3= Float.parseFloat(args[2]);
   
          float averagemarks= (marks1+marks2+marks3)/3;

          System.out.println("The average marks are:" +averagemarks);

	  } //end of main
   
   }//end of class AverageDemo   