package clasessWithAttributes;

public class Product {
	
public Product () {
	System.out.println("Yapıcı Blok Çalıştı");
}
	


	//attribute , Field
	private int _id;
	private String _name;
	private String _description;
	private double _price;
	private int _stockAmount;
	private String _renk ;
	private String _kod;
	
	
	
	
	
	//getter
	public int getId () {
		return _id;
		
		
	}
	//setter
	public void setId (int id) {
		_id = id;
		
	}
	public String get_name() {
		return _name;
	}
	public void set_name(String name) {
		this._name = name;
	}
	public String get_description() {
		return _description;
	}
	public void set_description(String description) {
		this._description = _description;
	}
	public double get_price() {
		return _price;
	}
	public void set_price(double price) {
		this._price = _price;
	}
	public int get_stockAmount() {
		return _stockAmount;
	}
	public void set_stockAmount(int stockAmount) {
		this._stockAmount = _stockAmount;
	}
	public String get_renk() {
		return _renk;
	}
	public void set_renk(String renk) {
		this._renk = renk;
	}
	public String getkod() {
		return this._name.substring(0, 1)+ _id;
	}
	
   
}
