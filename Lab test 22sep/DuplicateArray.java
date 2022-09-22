import java.util.Arrays;
import java.util.Scanner;
//declare a class
public class DuplicateArray 
{

    
    static void inputArray() 							// mathod to take array elements from user
	{

        Scanner sc = new Scanner(System.in);           //using scanner

        
        System.out.println("How many elements you want in array");   // taking size of an array
        int size = sc.nextInt();

        
        int[] arr = new int[size];                      // declaration array

        
        System.out.println("Enter array elements");    // storing the elements in array
        for (int i = 0; i < arr.length; i++)
		{
            arr[i] = sc.nextInt();
        }

        
        Arrays.sort(arr);								// sorting array

        
        System.out.println("Elements are : ");           // calling methodto print element in array
        displayArray(arr);

        
        int newSize = countDuplicates(arr);    				// calling method to count new size of array after removing duplicates values

        
        System.out.println("\nNew Array value are : ");      // calling method to remove duplicate element in array
        removeDuplicate(newSize, arr);
    }

    // creating method to count how many elements has left after removing duplicate values
    static int countDuplicates(int[] arr) 
	{

        int newSize = 0;
        for (int i = 0; i < arr.length - 1; i++) 
		{
            if (arr[i] != arr[i + 1])
			{
                newSize++;
            }
        }
        return newSize + 1; // +1 because last element of array has left
    }

    // creating method to store non-duplicate values in new array
    static void removeDuplicate(int newSize, int[] dArry) 
	{

        int index = 0;
        int tempArray[] = new int[newSize];

        for (int i = 0; i < dArry.length - 1; i++) 
		{

            if (dArry[i] != dArry[i + 1]) 
			{
                tempArray[index] = dArry[i];
                index++;
            }
        }

        // adding last value of dArray into tempArray
        tempArray[index] = dArry[dArry.length - 1];

        displayArray(tempArray);
    }

    // creating method to print array
    private static void displayArray(int[] arr) 
	{

        for (int i : arr) 
		{
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) 
	{

        // calling method to take input
        inputArray();
    }
}