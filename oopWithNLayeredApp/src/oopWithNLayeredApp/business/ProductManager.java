package oopWithNLayeredApp.business;

import java.util.List;

import oopWithNLayeredApp.core.login.Logger;
import oopWithNLayeredApp.dataAcces.JdbcProductDao;
import oopWithNLayeredApp.dataAcces.ProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {
	private ProductDao productDao;
	private Logger[] loggers;
	
public ProductManager(ProductDao productDao, Logger[] loggers) {
		this.productDao = productDao;
		this.loggers = loggers;
	}


public ProductManager(JdbcProductDao productDao2) {
	// TODO Auto-generated constructor stub
}


public void add (Product product)throws Exception {
	// iş kuralları
	if (product.getUnitPrice()<10) {
		throw new Exception("Ürün fiyatı 10 dan küçük olamaz");
	}
	productDao.add(product);
	
	for (Logger logger : loggers) { // [önce db nin çalşıyor allta sonra mail]
		logger.log(product.getName());
	}
	
}
}
