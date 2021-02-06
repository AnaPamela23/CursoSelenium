package com.excersise;

public abstract class TcketsParks {
	String welcomMessage;
	public TcketsParks() {
		this.welcomMessage = "Welcome Cooltesters Park ";
	}
public String welcomeMessageString() {
	return this.welcomMessage;
}

//Abstraction
public abstract double getTicketPrice();
public abstract void printPriceDay();
public abstract void printPriceDay();(String keyManager, String priceDay);

}
