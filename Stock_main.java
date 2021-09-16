package pregovor;

public class Stock_main {
//	Write a test program that creates a Stock object with the stock symbol ORCL , the name
//	Oracle Corporation , and the previous closing price of 34.5 . Set a new current
//	price to 34.35 and display the price-change percentage.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stock s = new Stock("ORCL", "Oracle Corporation");
		s.setPreviousClosingPrice(34.5);
		s.setCurrentPrice(34.35);
		System.out.println((s.getChangePercent()) + "%");
	}

}
