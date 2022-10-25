package overriding;

public class Ogrencıkredimanager extends Basekredimanager{
	public double hesapla (double tutar) {
		return tutar * 1.10;
	}

}
