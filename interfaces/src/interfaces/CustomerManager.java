package interfaces;

public class CustomerManager {
	
	ICostumerDal cusCostumerDal;
	
	public void Add () {
		// iş kodları
		cusCostumerDal.Add();
		
	}

}
