package com.cognizant.mapfilter;




public class Product {
	
	public String productId;
	public String name;
	public int quantity;
	
	public Product() {
		
	}
	
	public Product(String productId, String productName, int quantity) {
		// TODO Auto-generated constructor stub
		this.productId = productId;
		this.name = productName;
		this.quantity = quantity;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(this == obj) {
			return true;
		}
		Product prod = (Product) obj;
		
		return ( 
				(name == prod.name) && 
				(quantity == prod.quantity) );
	}
	
	
	

}
