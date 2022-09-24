package multiDimensionalArrayDemo;

public class MultiDimensionalArrayDemo {

	public static void main(String[] args) {
	String [] [] sehirler = new String [3] [3];
	
	
	sehirler [0] [0] = "İstanbul";
	sehirler [0] [1] = "Bursa";
	sehirler [0] [2] = "İzmir";
	sehirler [1] [0] = "Ankara";
	sehirler [1] [1] = "Eskişehir";
	sehirler [1] [2] = "Hatay";
	sehirler [2] [0] = "Antalya";
	sehirler [2] [1] = "Konya";
	sehirler [2] [2] = "Mersin";
	
	for (int i = 0; i<=2;i++) {
		System.out.println("------------");
		for (int j=0;j<=2;j++) {
			System.out.println(sehirler [1][j] );
		}
	}
	

	}

}
