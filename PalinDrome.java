
/*
   @author Neelam Ghodake
   @18 august 2022
   Program:3
   */
      class PalinDrome
	  {
	  
	      static void PalinDrome()
		  {
			  int r, sum=0, temp;
			  int n=262;       //the number is variable to be checked for palindrome
			  
			  
			  temp = n;
			  while(n>0)
			  {
				  r=n%10;       //getting a reminder
				  sum = (sum*10) + r;
				  n=n/10;
			  }
			  
			  
			         if(temp==sum)
						 System.out.println("It is palindrome number");
					 else
						 System.out.println("It is not a palindrome");
					 
					 
		  }
		  
		         public static void main(String args[])
				 {
					 PalinDrome();
					 
				 }
				 
	  }
				 