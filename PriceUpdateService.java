package test.sample.priceListener;

public interface PriceUpdateService {

    /**
     * Register a PriceListener to receive the prices sent from the bank to
     * the 3rd party company.
     * 
     * @param priceListener listener for bank prices
     */
    void subscribeToBankPriceUpdates(PriceListener priceListener);

    /**
     * Register a PriceListener to receive the prices sent from the 3rd party
     * company to the clients
     * 
     * @param priceListener listener for publisher prices
     */
    void subscribeToCompanyPriceUpdates(PriceListener priceListener);
    
    /**
     * This function is created additionallyto notify Monitors in a single go.
     * 
     */
	void notifyMonitors(PriceData priceData, String type);
    
    /**
     * This method has been created additionally to provide functionality of removing monitors if they want to un-subscribe.
     * 
     * @param Monitor to be removed.
     * @param monitorToRemove
     */
    void removeMonitor(PriceListener monitorToRemove);


}
	