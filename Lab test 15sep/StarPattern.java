/*
@author :Neelam Ghodake
@Date   :15 sep 2022
Program :Java program to print a pattern
                *
			  *   *
			*   *   *
		  *   *   *   *
*/

    public class StarPattern
	{
		//calling main method
	  public static void main(String[] args)
	  {
	     int i,j,row=4;                        //i for rows and j for columns 
		                                       // row denotes the number of rows you want to print
		 for(i=0;i<row;i++)						//Outer loop for loop
		 {
		   for(j=row-i;j>1;j--)					//inner loop for space
		   {
			   System.out.print(" ");            //print space between 2 stars
			   
		   }
		   
		   for(j=0;j<=i;j++)					//inner loop for columns
		   {
			   System.out.print("*");			//print star
		   }
		     
			  System.out.println();				//throws the cursor in a new line after printing each line
		 }
	  }
	}
		   
		                    