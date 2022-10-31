package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class UsedProduct extends Product{

	private static final SimpleDateFormat simpleFormatter = new SimpleDateFormat("dd/MM/yyyy");
	
	public Date manufactureDate;
	
	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	@Override
	public final String priceTag() {
		
		return getName() 
				+ " (Used)"
				+ " $ " 
				+ String.format("%.2f", getPrice())
				+ " (Manufacture date: "
				+ simpleFormatter.format(manufactureDate)
				+ ")";
	}
	
}
