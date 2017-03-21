package test.sample.priceListener;

/*
* EntryPoint(PriceMonitorAppMain.java)
* 
* 1) For implementing this solution Observer Pattern is used. 
* 2) There is one observer(PricePublishMonitor.java) and a Subject(TwoWayMonitor.java) which 
* is registering observers for PublishMonitors' proper work.
* 3) PriceListener class structure is not suitable so i have modified it with two functions.
* 4) PriceData Object has been created to store symbol and price information encapsulated in one object.
* 5) PriceUpdateService has been used intact.
* 6) No clients for third party are being created as they are not required as per problem.
* 7) For testing purpose, test cases class(TestPriceMonitorAppMain, TestTwoWayMonitor) has been created and test cases has been written
* but are not fully implemented.
* 
* 
* 

*/