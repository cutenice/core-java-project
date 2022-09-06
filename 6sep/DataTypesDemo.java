/*
Program: Understanig data tyapes in java
@author: Neelam Ghodake
@date:   6 sep 2022
*/

  class DataTypesDemo
  {
      //calling main method
	  static int number;
	  public static void main(String[] args)
	  {
		  //primitive data types
	      int number=50;
		  short value=(short)-32769;  //typecasting
		  float marks=67.8f;
		  double percentage=98.765;
		  char grade='A';
		  long hugeNumber=8876434587625358L;
		  boolean status= true;
		  byte b = (byte)128;   //typecasting
		  String firstName="Neelam"; //not a primitive data type : String is a class java.lang package
		  
		  
		  System.out.println("The value of int is:" +number);
		  System.out.println("The value of short is:" +value);
		  System.out.println("The value of marks is:" +marks);
		      System.out.println("The value of percentage is:" +percentage);
			  System.out.println("The value of grade is:" +grade);
			  System.out.println("The value of hugeNumber is:"+hugeNumber);
			  System.out.println("The value of status is:"+status);
			     System.out.println("The value of b is:"+b);
			     System.out.println("The value of string is:"+firstName);
		  
		  
	  }
	  //end of main
	  
  }
  //end of class DataTypesDemo