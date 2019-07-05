package com.xerox;

public class Stock {

	public String getStockPrice(String Symbol) {

		if (Symbol.equals("mule")) {
			return "100";
		} else if (Symbol.equals("ibm")) {
			return "200";
		} else {
			return "Stock doesn't exit";
		}

	}

}
