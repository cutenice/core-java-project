/*
  Program: Add 2 numbers
  @author: Neelam Ghodake
  @Date: 6 sep 2022
  */
  
  //declaring a class
  class AdditionDemo
  {
	  //calling main method
	  public static void main(String[] args)
	  {
		  /* int a,b;
		  a=30;
		  b=20;
		  System.out.println(a+b); */
		  
		  int num1= Integer.parseInt(args[0]);
		  int num2= Integer.parseInt(args[1]);
		  
		  //System.out.println(num1+num2);
		  
		  System.out.println(Integer.parseInt(args[0])+Integer.parseInt(args[1]));
	  }
	  //end of main
	  
  }
  //end of class AdditionDemo