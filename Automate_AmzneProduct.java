package Amazon_Implementation;

import java.util.ArrayList;
import java.util.List;

public class Product {

	private String productName; //declare the string variable
	private int price; // declare the variable as Integer i.e., price
	
	public Product(String productName, int price) {
		
		this.productName = productName;
		this.price = price;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public List<String> getProductList(){
		List<String> productList =new ArrayList<>();
		productList.add("Apple Mackbook Pro ");
		productList.add("Apple Mackbook Air ");
		productList.add("Apple Iphone 12 pro ");
		//productList.add("Apple iphone 13pro Max ");
	
		return productList;
	}
	
	
	
}
