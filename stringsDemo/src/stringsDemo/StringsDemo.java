package stringsDemo;

public class StringsDemo {

	public static void main(String[] args) {
		String mesaj = "bugün çok güzel bir gün";
		System.out.println(mesaj);
		
		System.out.println("Eleman sayısı: " + mesaj.length());
		System.out.println("5.eleman : " + mesaj.charAt(4) );
		System.out.println(mesaj.concat(" Yaşasın "));
		System.out.println(mesaj.startsWith("b"));
		System.out.println(mesaj.endsWith("n"));
		char [] karakterler = new char [5];
		mesaj.getChars(0, 4, karakterler, 0);
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf("o"));
		System.out.println(mesaj.lastIndexOf("z"));
			
		}
		

	}


