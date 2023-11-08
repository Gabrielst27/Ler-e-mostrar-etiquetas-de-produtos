package entities;

public final class ImportedProduct extends Product {
	
	private Double customsFee;
	
	public ImportedProduct() {
		super();
	}

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public final Double getCustomsFee() {
		return customsFee;
	}

	public final void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	public final Double totalPrice() {
		return price + customsFee;
	}
	
	@Override
	public final String priceTag() {
		return name + " - $ " + String.format("%.2f", totalPrice())
		+ " (Customs fee: $ " + String.format("%.2f", customsFee);
	}

}
