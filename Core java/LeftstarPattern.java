/*
   @author : Neelam Ghodake
   @Date :21 aug 2022
   Program: Program to print left triangle star pattern
   */
     class LeftstarPattern
	 {
	   public static void main(String args[])
	   {
	     int row,column,numberOfRows=6;
		  for(row=0;row<numberOfRows;row++)
		  {
		   for(column=2*(numberOfRows-row); column>2;column--)
		    {
				System.out.print(" ");
			 }
			   
			 for(column=0; column<=row;column++)
			 {
				 System.out.print("*");   //to move cursor to new line for each row
			  }
			      System.out.println();
					  
		  }
	   }
	 }
	 