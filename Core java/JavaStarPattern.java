/*
  @author:Neelam Ghodake
  @Date:21 aug 2022
  Program:Program to print Right Triangle star pattern
  */
  
  class JavaStarpattern
  {
        public static void main(String args[])
		{
			int row, column,
			numberOfRows=8;
			for(row=0; row<numberOfRows; row++)
			{
			  for(column=0; column<=row; column++)
			  {
                 System.out.print("*");     //this is just to print the stars in new line after each row
			  }	
                 System.out.println();
            }
        }
  }		
		