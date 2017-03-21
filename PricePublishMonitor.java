package test.sample.priceListener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PricePublishMonitor implements PriceListener {
	
	TwoWayMonitor twoWayMonitorData;	
	
	Map<String,Double> bankPriceList = new HashMap<>();
	Map<String,Double> thirdPartyPriceList = new HashMap<>();
	
	
	public PricePublishMonitor(TwoWayMonitor twoWayMonitorData) {
		this.twoWayMonitorData = twoWayMonitorData;
		twoWayMonitorData.subscribeToBankPriceUpdates(this);
		twoWayMonitorData.subscribeToCompanyPriceUpdates(this);
	}

	@Override
	public void priceUpdateBank(String symbol, double price) {
		System.out.println("Price Updates being done from bank " + symbol + ", " + price);
		bankPriceList.put(symbol, price);
	}

	@Override
	public void priceUpdateThirdParty(String symbol, double price) {
		System.out.println("Price Updates being done from third party " + symbol + ", " + price);
		thirdPartyPriceList.put(symbol, price);
	}
}
