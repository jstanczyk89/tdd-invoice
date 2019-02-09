package pl.edu.agh.mwo.invoice.product;

import java.math.BigDecimal;

public abstract class Product {
	private final String name;

	private final BigDecimal price;

	private final BigDecimal taxPercent;

	protected Product(String name, BigDecimal price, BigDecimal tax) throws IllegalArgumentException{
		if (name == null){
			throw new IllegalArgumentException("Name cannot be null");
		}
		if (name.equals("")){
			throw new IllegalArgumentException("Name cannot be empty");
		}
		if (price == null){
			throw new IllegalArgumentException("Price cannot be null");
		}
		if (price.signum() == -1){
			throw new IllegalArgumentException("Price cannot be negative");
		}
		this.name = name;
		this.price = price;
		this.taxPercent = tax;
	}

	public String getName() throws IllegalArgumentException {
	
		return this.name;
	}

	public BigDecimal getPrice() {
		return this.price;
	}

	public BigDecimal getTaxPercent() {
		return this.taxPercent;
	}

	public BigDecimal getPriceWithTax() {
		
		
		return (this.price.multiply(this.taxPercent)).add(price) ;
	}
}
