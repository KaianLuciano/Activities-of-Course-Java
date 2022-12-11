package entities;

public class Products {

	private String nameProduct;
	private Double priceProduct;

	public Products(String nameProduct, Double priceProduct) {
		this.nameProduct = nameProduct;
		this.priceProduct = priceProduct;
	}

	public String getNameProduct() {
		return nameProduct;
	}

	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}

	public Double getPriceProduct() {
		return priceProduct;
	}

	public void setPriceProduct(Double priceProduct) {
		this.priceProduct = priceProduct;
	}
	
}
