package test.sample.priceListener;

import java.util.List;
import java.util.Map;

public class Monitor {

	private Map<String,Double> bankPrices;

	private Map<String,Double> thirdPartyPrices;

	public Map<String, Double> getBankPrices() {
		return bankPrices;
	}

	public void setBankPrices(Map<String, Double> bankPrices) {
		this.bankPrices = bankPrices;
	}

	public Map<String, Double> getThirdPartyPrices() {
		return thirdPartyPrices;
	}

	public void setThirdPartyPrices(Map<String, Double> thirdPartyPrices) {
		this.thirdPartyPrices = thirdPartyPrices;
	}

}
