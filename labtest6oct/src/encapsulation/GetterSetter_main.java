package encapsulation;

public class GetterSetter_main {
	public static void main(String[] args) {
        //create an object of Student class
        GetterSetter s=new GetterSetter();
        //set fields values using setter methods
        s.setId (25);
        s.setname("Neelam Ghodake");
        //print values using getter methods        
        System.out.println("Student Data:" + "\nStudent ID:" + s.getId()+"\n Student Name:" + s.getname());
    }
}
