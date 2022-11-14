package bank;

public class Bank_main {
	public static void main(String[] args) {
		//Interest of Bank
        Bank b1 = new Bank();
        b1.bank();
        
        //Interest of AXIS
        Bank b2 = new AXIS();
        b2.bank();

         //Interest of ICICI
         Bank b3 = new ICICI();
         b3.bank();
         
         //Interest of SBI
         Bank b4 = new SBI();
         b4.bank();
    }

}
