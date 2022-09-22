/*
@author :Neelam Ghodake
@Date   :22 sep 2022
Program1:Write a  java program to create a BankAccount and display the people with balance less than 1000.
*/


//declaring a class for assign the memory to BankAc class
public class Bank 
{
    
    // main method
    public static void main(String[] args) 
	{
        
        //create array of Bank object
        BankAc[] customer = new BankAc[5];

        //storing customer details in Bank object's array -> constructor injection
        customer[0] = new BankAc(343536, "Divya", 1500);
        customer[1] = new BankAc(444546, "Poonam", 850.56);
        customer[2] = new BankAc(545556, "Kanchan", 700.01);
        

        //storing customer details in Bank object's array -> set method
        customer[3] = new BankAc();
        customer[3].setAc_Num(636264);
        customer[3].setName("Pooja");
        customer[3].setBalance(1000.02);

        customer[4] = new BankAc();
        customer[4].setAc_Num(322324);
        customer[4].setName("Piyusha");
        customer[4].setBalance(1234.45);       

        //displaying all customer details
        System.out.println("----------------All customer Details--------------");
        for (int i = 0; i < customer.length; i++) 
		{
            customer[i].display();
        }

        //display customers whose marks grater than 90%
        System.out.println("--------------customers whose account balance is less than 1000rs--------------------");
        for (int i = 0; i < customer.length; i++) 
		{
            if (customer[i].getBalance() < 1000) 
			{
                customer[i].display();
            }
        }
        System.out.println();
    }
}