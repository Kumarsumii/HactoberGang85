package Amazon_Implementation;

public class Search {

	
	public String displayProduct(Product product, String s) {
		// TODO Auto-generated method stub
		product.setProductName(s);
		if(product.getProductList().contains(product.getProductName())) {
			return product.getProductName();
		}
		
		return null;
	}
	
	
}
