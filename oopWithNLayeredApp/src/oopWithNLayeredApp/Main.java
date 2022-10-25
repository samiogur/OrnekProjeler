package oopWithNLayeredApp;

import oopWithNLayeredApp.business.ProductManager;
import oopWithNLayeredApp.core.login.DatabaseLogger;
import oopWithNLayeredApp.core.login.FileLogger;
import oopWithNLayeredApp.core.login.Logger;
import oopWithNLayeredApp.core.login.MailLogger;
import oopWithNLayeredApp.dataAcces.JdbcProductDao;
import oopWithNLayeredApp.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
	Product product1 = new Product (1,"İphone Xr",9000);
	
	Logger[] loggers = {new DatabaseLogger(),new FileLogger(),new MailLogger()};
	
	ProductManager productManager = new ProductManager( new JdbcProductDao(), loggers);
	productManager.add(product1);
	}

}
