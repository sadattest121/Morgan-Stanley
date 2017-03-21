package test.sample.priceListener;

public class PriceMonitorAppMain {

	public static void main(String... strings) {
		TwoWayMonitor twoWayMonitor = new TwoWayMonitor();

		PricePublishMonitor publishMonitor = new PricePublishMonitor(twoWayMonitor);

		twoWayMonitor.setBankUpdates(new PriceData("IBM", 0.99));
		twoWayMonitor.setBankUpdates(new PriceData("MS", 0.919));
		twoWayMonitor.setBankUpdates(new PriceData("GM", 0.909));

		twoWayMonitor.setThirdPartyUpdates(new PriceData("IBM", 0.099));
		twoWayMonitor.setThirdPartyUpdates(new PriceData("Microsoft", 0.199));
		twoWayMonitor.setThirdPartyUpdates(new PriceData("Genpact", 0.899));

		twoWayMonitor.displayBankAndThirdPartyPrices();
		twoWayMonitor.displayBankObservers();

	}

}
