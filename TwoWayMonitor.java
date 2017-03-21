package test.sample.priceListener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoWayMonitor implements PriceUpdateService  {

	// List of Both type subjects aka List<Monitor>
	private Monitor twoDataSets;

	private List<PriceListener> bankObservers;
	
	
	public void displayBankAndThirdPartyPrices() {
		System.out.println("Bank prices : " + twoDataSets.getBankPrices());
		System.out.println("Third Party prices : " + twoDataSets.getThirdPartyPrices());
	}

	public void displayBankObservers() {
		System.out.println("bank observers : " + bankObservers.size());
	}

	public void setBankUpdates(PriceData priceData) {
		Map<String,Double> bankPrices = twoDataSets.getBankPrices();
		if(bankPrices != null) {
			bankPrices.put(priceData.getSymbol(), priceData.getPrice());
		}
		notifyMonitors(priceData, "bank");
	}
	
	public void setThirdPartyUpdates(PriceData priceData) {
		Map<String,Double> thirdPartyPrices = twoDataSets.getThirdPartyPrices();
		if(thirdPartyPrices != null) {
			thirdPartyPrices.put(priceData.getSymbol(), priceData.getPrice());
		}
		notifyMonitors(priceData, "thirdParty");
	}
		
	public TwoWayMonitor() {
		bankObservers = new ArrayList<>();
		Map<String,Double> bankPrices = new HashMap<>();
		Map<String,Double> thirdPartyPrices = new HashMap<>();
		
		twoDataSets = new Monitor();
		twoDataSets.setBankPrices(bankPrices);
		twoDataSets.setThirdPartyPrices(thirdPartyPrices);
	}
	
	@Override
	public void subscribeToBankPriceUpdates(PriceListener priceListener) {
		bankObservers.add(priceListener);	
		
	}

	@Override
	public void subscribeToCompanyPriceUpdates(PriceListener priceListener) {
		// bankObservers.add(priceListener);
		// Since there is only one observer so subscribing to any one will subscribe to both parties
		// priceUpdate Service interface needs  change. 
		// There is some discrepency in interfaces designed and provided.
		
	}

	@Override
	public void notifyMonitors(PriceData priceData, String type) {
		for (PriceListener observer : bankObservers) {
			if(type.equals("bank")) {
				observer.priceUpdateBank(priceData.getSymbol(), priceData.getPrice());
			} else if (type.equalsIgnoreCase("thirdParty")) {
			observer.priceUpdateThirdParty(priceData.getSymbol(), priceData.getPrice());
			}
		}		
	}

	@Override
	public void removeMonitor(PriceListener monitorToRemove) {
		// Code to remove observers. No expected as per problem so not implemented.
	}
	
	public boolean startTimelyCheck(int timeCount) {
		// This function will work on check the Monitor object data which is carrying two HashMaps of Third
		// Party data and Bank's shared Data.
		// Both HashMaps will be compared against each other with every 30 mins elapsed.
		// if false it means, data is correctly shared by third party.
		return false;
	}
}

