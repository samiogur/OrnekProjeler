package switchDemo;

public class SwitchDemo {

	public static void main(String[] args) {
	char grade = 'A';
	
	switch (grade) {
	      case 'A':
	    	  System.out.println("Mükemmel Geçtiniz");
	    	  break;
	          case 'B':
	        	  System.out.println("Çok güzel Geçtiniz");
		    	  break;
	          case 'C':
	        	  System.out.println("iyi Geçtiniz");
		    	  break;
	          case 'D':
	        	  System.out.println("Fena değil Geçtiniz");
		    	  break;
	          case 'E':
	        	  System.out.println("Sınırda Geçtiniz");
		    	  break;
	          case 'F':
	        	  System.out.println("Kaldınız");
		    	  break;
		    	  default:
		    		  System.out.println("Geçersiz not girdiniz");
		    	  
	}
	
	
	}

	
}
