package pregovor;

public class Stock {
	
//	Design a class named Stock that contains:
//
//		A string data field named symbol for the stock’s symbol.
//		A string data field named name for the stock’s name.
//		A double data field named previousClosingPrice that stores the stock
//		price for the previous day.
//		A double data field named currentPrice that stores the stock price for the
//		current time.
//		A constructor that creates a stock with the specified symbol and name.
//		A method named getChangePercent() that returns the percentage changed
//		from previousClosingPrice to currentPrice .
//

	private String symbol;
	private String name;
	private double previousClosingPrice;
	private double currentPrice;
	
	Stock(){
		
	}
	
	Stock(String symbol, String name){
		this.setSymbol(symbol);
		this.setName(name); 
	}
	public double getChangePercent() {
		return ((currentPrice - previousClosingPrice) / previousClosingPrice ) * 100 ;
	}
	public double getPreviousClosingPrice() {
		return this.previousClosingPrice;
	}
	public void setPreviousClosingPrice(double previousClosingPrice) {
		this.previousClosingPrice = previousClosingPrice;
	}
	public double getCurrentPrice() {
		return this.currentPrice;
	}
	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
