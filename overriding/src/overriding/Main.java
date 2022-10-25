package overriding;

public class Main {

	public static void main(String[] args) {
		Basekredimanager [] kredBasekredimanager = new Basekredimanager[] 
				{new Ogretmenkredimanager(),new Tarımkredimanager(),new Ogrencıkredimanager()};
		for (Basekredimanager kreBasekredimanager: kredBasekredimanager) {
			System.out.println(kreBasekredimanager.hesapla(1000));
		}
	}
}

