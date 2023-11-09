package entities;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public final class UsedProduct extends Product {
	
	public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private LocalDate manufactureDate;
	
	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, Double price, LocalDate date) {
		super(name, price);
		this.manufactureDate = date;
	}

	public LocalDate getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(LocalDate manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	@Override
	public String priceTag() {
		return name + " (used) - $ " + String.format("%.2f", price)
		+ " (Manufacture date: " + sdf.format(manufactureDate) + ")";
	}

}
