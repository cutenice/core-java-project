
/*
  Name:-Neelam Ghodake
  Date:-25 aug 2022
  Program 1:-Lab Assesment
  */
     class NumericalPattern
	 {
		 public static void printNums(int n)
		 {
			 int i,j,num;
			 //outer loop for rows
			 for(i=0;i<n;i++)
			 {
				 num=1;
				 //inner loop for rows
				 for(j=0;j<=i;j++)
				 {
					 //printing num with a space
					 System.out.print(num+"");
					 
					 //incrementing value of num
					 num++;
				 }
				   //ending line after each rows
				   System.out.println();
			 }
		 }
		     public static void main(String args[])
			 {
				 int n=5;
				 printNums(n);
			 }
	 }