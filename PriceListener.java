package test.sample.priceListener;

public interface PriceListener {
	
    /**
     * This method gets called each time a price update is sent by bank
     * 
     * @param symbol the product symbol
     * @param price the product price
     */
    void priceUpdateBank(String symbol, double price);
    

    /**
     * New method is required as single method could not do both the works of price 
     * updates from bank and third party when working together
     * This method gets called each time a price update is sent from third party.
     * 
     * @param symbol the product symbol
     * @param price the product price
     */
    void priceUpdateThirdParty(String symbol, double price);

	
}