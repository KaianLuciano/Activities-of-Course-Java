package entities;

public class ImportedProducts extends Product{
	
	private Double customFee;
	
	public ImportedProducts() {
		super();
	}

	public ImportedProducts(String name, Double price, Double customFee) {
		super(name, price);
		this.customFee = customFee;
	}

	public Double getCustomFee() {
		return customFee;
	}

	public void setCustomFee(Double customFee) {
		this.customFee = customFee;
	}
	
	public Double totalPrice() {
		return price + customFee;
	}
	
	@Override
	public String priceTag() {
		return getName() 
				+ " $ " 
				+ String.format("%.2f", totalPrice())
				+ " (Customs fee: $ " 
				+ String.format("%.2f", customFee)
				+ ")";
	}
	
}
