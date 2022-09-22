/*
@author :Neelam Ghodake
@Date   :22 sep 2022
Program1:Write a  java program to create a BankAccount and display the people with balance less than 1000.
*/
// declaring a class
public class BankAc 
{
    
    //instance variable of customer details
    private int ac_num;
    private String name;
    private double balance;

    BankAc() {} //default constructor
	

    //parameterized constructor to set value of instance variable
    BankAc(int ac_num, String name, double balance) 
	{

        this.ac_num = ac_num;
        this.name = name;
        this.balance = balance;
    }

    //set and get method -> Account Number
    public void setAc_Num(int ac_num) 
	{
        this.ac_num = ac_num;
    }
    public int getAc_Num() 
	{
        return this.ac_num;
    }

    //set and get method -> Account Holder Name
    public void setName(String name) 
	{
        this.name = name;
    }
    public String getName() 
	{
        return this.name;
    }

    //set and get method -> Account Balance
    public void setBalance(double balance) 
	{
        this.balance = balance;
    }
    public double getBalance() 
	{
        return this.balance;
    }

    //method to display student details
    public void display() 
	{
        System.out.println(this.ac_num+"  "+this.name+"   "+this.balance+"rs");
    }

    //method to display those customer whose account balance > 1000
}
