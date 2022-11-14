package labtest29sep;

public class AndroidPhone_main {

	public static void main(String[] args) {
        AndroidPhone a1 = new AndroidPhone( 80 , "Leena" , true);
        AndroidPhone a2 = new AndroidPhone( 90 , "Meena" , false);
        AndroidPhone a3 = new AndroidPhone( 100, "Sheela" , true);

        AndroidPhone[] arrays= {a1,a2,a3};
        
        for(AndroidPhone x:arrays)
        {
        	x.connector();
        }
    }

}
