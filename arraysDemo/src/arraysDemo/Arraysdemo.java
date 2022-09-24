package arraysDemo;

public class Arraysdemo {

	public static void main(String[] args) {
	  String öğrenci1= "Ali";
	  String öğrenci2= "Mahmut";
	  String öğrenci3= "Mustafa";
	  String öğrenci4= "Malik";
	  
	  System.out.println("---------------------");
	  
	    System.out.println(öğrenci1);
	    System.out.println(öğrenci2);
	    System.out.println(öğrenci3);
	    System.out.println(öğrenci4);
	    
	    String [] öğrenciler = new String [3];
	    öğrenciler [0]= "Ali";
	    öğrenciler [1]= "Mahmut";
	    öğrenciler [2]= "Mustafa";
	    
	    for (int i=0;i<öğrenciler.length;i++) {
	    	System.out.println(öğrenciler[i]);
	    }
	         
       
	   
	}

}
