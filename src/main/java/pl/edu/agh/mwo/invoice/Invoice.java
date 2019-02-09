package pl.edu.agh.mwo.invoice;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import pl.edu.agh.mwo.invoice.product.Product;

public class Invoice {
	private Collection<Product> products = new ArrayList<Product>();

	public void addProduct(Product product) {
	
	ArrayList<String> products = new ArrayList<String>();
	
	addProduct.add(product,1);
	
	}

	public void addProduct(Product product, Integer quantity) {
		for (int i = 0; i < quantity; i++){
			this.addProduct(product);
		}
		
	}

	public BigDecimal getSubtotal() {
		BigDecimal sum = BigDecimal.ZERO;
		for(Product product :this.products){
			sum = sum.add(product.getPrice());
		}
		return sum;
	}

	public BigDecimal getTax() {
		return BigDecimal.ZERO;
	}

	public BigDecimal getTotal() {
		return getSubtotal().add(getTax());
	}
}

