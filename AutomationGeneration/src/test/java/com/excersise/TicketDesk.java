package com.excersise;

public class TicketDesk{

public static void main(String[] args) {

	double precioCoolPark=150;
	double precioTestersPark=160;
	int age=25;
	boolean student=true;
		
		CoolParkTicket coolPark = new CoolParkTicket(100,10,true);
		coolPark.printPriceDay("xyz", "Dia del niño");
		coolPark.getTicketPrice();
		}
}