package labtest29sep;

public class AndroidPhone {
	
	int battery;
    String contacts;
    boolean isTouchpad;
     AndroidPhone(int battery, String contacts, boolean isTouchpad) {
        this.battery = battery;
        this.contacts = contacts;
        this.isTouchpad  = isTouchpad;
    }
    public void connector() {
        System.out.println("Battery Life is:- " + battery +"   Contact Name is:-" + contacts +"   Is it a Touchpad? " + isTouchpad );
    }
	

}
