package reCapdemo2;

public class Recapdemo2 {

	public static void main(String[] args) {
		double[]myList = {1.2,1.3,4.3,5.6};
		double total=0;
		double max = myList [0];
		
			
	
		
		for (double number:myList) {
			total = total + number;
			System.out.println(number);
			
			System.out.println("Toplam ="+ total);
		}
	}

}
