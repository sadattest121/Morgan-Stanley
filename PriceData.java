package test.sample.priceListener;

public class PriceData {

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	String symbol;

	double price;
	
	PriceData(String symbol, double price) {
		this.symbol = symbol;
		this.price = price;
	}
}
