package intro;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!"); //Konsola yazı yazdırmaya yarıyor.
        String ortaMetin ="İlginizi çekebilir";// String veri tipinde değişken alma.
        String altMetin = "Vade Süresi";
        System.out.println(ortaMetin);
        int vade = 12; // İnteger(Tam sayı)veri tipinde değişken alma. 
        double dolarDun = 18.20;// Double(Tam sayı)veri tipi değişken alma.
        double dolarBugun = 18.20;
        boolean dolarDustumu = true;// Boolean(Onaylama)veri tipi değişken alma.
        String okYonu = "";
        if(dolarBugun<dolarDun){
            okYonu="down.svg";
            System.out.println(okYonu);
            System.out.println(okYonu);
        }
        else if(dolarBugun<dolarDun){
            okYonu="up.svg";

        }
        else{

            okYonu = "equal.svg";
            System.out.println(okYonu);

        }
        String[] krediler = {"Hızlı kredi", "Maaşı Halkbanktan", "Mutlu emekli"};
        for (int i = 0; i < krediler.length ; i++) {
            System.out.println(krediler[i]);

        }
    }
}