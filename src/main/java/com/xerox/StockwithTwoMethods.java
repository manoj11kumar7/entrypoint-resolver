package com.xerox;

public class StockwithTwoMethods {
	
	public String getStockPriceUSD(String Symbol) {

		if (Symbol.equals("mule")) {
			return "100";
		} else if (Symbol.equals("ibm")) {
			return "200";
		} else {
			return "Stock doesn't exit";
		}

	}
	
	public String getStockPriceINR(String Symbol) {

		if (Symbol.equals("mule")) {
			return "7000";
		} else if (Symbol.equals("ibm")) {
			return "14000";
		} else {
			return "Stock doesn't exit";
		}

	}

}
