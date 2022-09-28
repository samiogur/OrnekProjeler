package methods2;

public class Methods2 {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel";
		String yeniMesaj = şehirVer();
		System.out.println(yeniMesaj);
		int sayı = topla (15,7);
		System.out.println(sayı);
		int toplam = topla2(2,3,4,5,6,10);
		System.out.println(toplam);
		
		
		

	}
    public static void ekle() {
    	System.out.println("Eklendi");
    	
    	
    
    }
    public static void sil () {
    	System.out.println("Silindi");

    }
    public static void güncelleme () {
    	System.out.println("Güncellendi");

    }
    public static int topla (int sayı1,int sayı2) {
    	return sayı1+sayı2;
    	
    }
     public static int topla2 (int...sayılar) {
    int toplam = 0;
    for (int sayı: sayılar) {
    	toplam+=sayı;
    }
    return toplam;
     }
    
   
    	

 
    
    public static String şehirVer () {
    	return "Ankara";
    }
}
