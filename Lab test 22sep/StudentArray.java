/*
@author :Neelam Ghodake
@Date   :22 sep 2022
Program1:Write a Student and create an array of 10 students and display the students whose marks are more than 90%.
*/
 
 
 import java.util.*;
 
//declaring a class
public class StudentArray 
{
    
    public static void main(String args[]) 				//calling Main method
	{
        
        Scanner sc = new Scanner(System.in);			// Taking input from user
        int n; 											// Declaring Variables

        
        System.out.println("Enter the total subjects ");  // Ask the user to enter the Array Size
        n = sc.nextInt();

        
        int arr[] = new int[n];											// Declaration of the array
        System.out.println("Enter the marks secured in each subject ");
        for (int i = 0; i < n; i++) 										// Initialize the array
        {
            arr[i] = sc.nextInt();
        }

        // Calculate the total marks
        for (int i = 0; i < n; i++) 
		{

            if (arr[i] >= 90) {
                System.out.println(" Marks are: " + arr[i]);
            }

        }

    }
}