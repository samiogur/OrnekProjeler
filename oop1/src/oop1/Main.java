package oop1;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Vade oranı";
		
		Productjava product1 = new Productjava();
	        product1.setName("Delonghi Kahve Makinesi");
	        product1.setDiscount(7);
	        product1.setUnitPrice(7500);
	        product1.setUnitInStock(3);
	        product1.setImageUrl("image1.jpg");
	       
	
		
	        Productjava product2 = new Productjava ();
	        product2.setName("Arzu Kahve Makinesi");
	        product2.setDiscount(4);
	        product2.setUnitPrice(4500);
	        product2.setUnitInStock(5);
	        product2.setImageUrl("image2.jpg");
			
			
		     Productjava product3 = new Productjava ();
		     product3.setName("Fakir Kahve Makinesi");
		     product3.setDiscount(6);
		     product3.setUnitPrice(2500);
		     product3.setUnitInStock(7);
		     product3.setImageUrl("image3.jpg");
			
			
			Productjava []products = {product1,product2,product3};
			
			System.out.println("<ul>");
			
			for (Productjava productjava : products) {
				System.out.println("<li>"+ productjava.getName() + "</li>");
			}
			System.out.println("</ul>");
			
			IndividualCustomer individualCustomer = new IndividualCustomer();
			individualCustomer.setId(1);
			individualCustomer.setPhone("2525552525");
			individualCustomer.setCustomerNumber("12345");
			individualCustomer.setFirstName("Sami");
			individualCustomer.setLastName ("Oğur");
			
			
			
			
			CorporateCustomer corporateCustomer = new CorporateCustomer ();
			corporateCustomer.setId(2);
			corporateCustomer.setCompanyName("Kodlama.io");
			corporateCustomer.setPhone("323232323");
			corporateCustomer.setTaxNumber("11111132");
			corporateCustomer.setCustomerNumber("4343434");
			
			
			
			
			
					
					
				}
				
				
				
				
			
		
		
		
		
		
		
		

	}


