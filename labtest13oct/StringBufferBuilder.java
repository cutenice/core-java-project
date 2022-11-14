package labtest13oct;

public class StringBufferBuilder {
public static void main(String[] args) {
		
		//String buffer class
		  StringBuffer sb = new StringBuffer("welcome ");
		  StringBuffer sb2 = new StringBuffer("To java");
		  //Equals method
		    System.out.println(sb.equals(sb2));
		  
		    //Reverse method
		    System.out.println(sb.reverse());
		    
		    //Append Method
		    System.out.println(sb.append("To java"));
		    
		  	//Insert method
	        sb.insert(8, "Core"); 
	        System.out.println(sb);
	        
	        //Delete method
	        System.out.println(sb2.delete(0, 2));
	}


}
