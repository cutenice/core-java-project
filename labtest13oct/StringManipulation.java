package labtest13oct;

public class StringManipulation {
	public static void main(String[] args) {
		String a = "Neelam";
		String b = "Ghodake";
		String c = "Hello my name is Neelam Ghodake";

		//'=' method
		System.out.println(a == b);

		//equals method
		System.out.println(a.equals(c));
		
		//concat method
		System.out.println(a.concat(b). concat(c));
		
		//replace method
		System.out.println(c.repeat(2));
		
		//split method
		System.out.println(c.split("G"));
		
		//Char method
		System.out.println(a.charAt(4));
		
		//compareTo method
		System.out.println(b.compareTo(a));
		
		//substring method
		System.out.println(c.substring(2, 5));
		
	}
}
