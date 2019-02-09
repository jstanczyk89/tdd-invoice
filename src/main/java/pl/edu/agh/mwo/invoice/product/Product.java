package pl.edu.agh.mwo.invoice.product;

import java.math.BigDecimal;

public abstract class Product {
	private final String name;

	private final BigDecimal price;

	private final BigDecimal taxPercent;

	protected Product(String name, BigDecimal price, BigDecimal tax) throws IllegalArgumentException{
		if (name.equals(null)){
			throw new IllegalArgumentException("Towar musi miec nazwe");
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
