package methods;

public class Methods {

	public static void main(String[] args) {
	sayıBulmaca ();
	sayıBulmaca ();
	sayıBulmaca ();
	sayıBulmaca ();
	
	    	   }

	public static void sayıBulmaca (){
		int [] sayılar = new int [] {1,2,5,7,9,0};
		int aranacak = 5;
		boolean varMı= false;
		
		for (int sayı : sayılar) {
			if (sayı==aranacak) {
				varMı = true;
				break;
				
			}
		}
		String mesaj= "";
		
	       if (varMı) {
	    	   mesaj = "Sayı mevcuttur:" + aranacak;
	    	   mesajVer (mesaj);
	       }else {
	    	   mesajVer("Sayı mevcut değildir:" + aranacak);
		
	    	   }
		
		
	}
	
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}
	
	}


