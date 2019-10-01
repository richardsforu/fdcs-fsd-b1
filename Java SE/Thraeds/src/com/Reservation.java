package com;

class BusOperator implements Runnable {

	private int noOfSeats = 1;
	private int wanted;

	public BusOperator(int wanted) {
		this.wanted = wanted;
	}

	@Override
	public void run() {
		bookTicket();
	}

	public void bookTicket() {

		String tname = Thread.currentThread().getName();

		System.out.println("Avialbel Seats are " + noOfSeats);
		System.out.println("Trying to book " + wanted + " seats for " + tname);

		synchronized (this) {
			if (noOfSeats >= wanted) {

				noOfSeats = noOfSeats - wanted;
				System.out.println("Booked " + wanted + " seats for " + tname);
			} else {
				System.out.println("Sorry! No seats are available for " + tname);

			}

		}

	}
}

public class Reservation {

	public static void main(String[] args) {

		BusOperator wbtc = new BusOperator(1);

		Thread p1 = new Thread(wbtc);
		Thread p2 = new Thread(wbtc);

		p1.setName("Passenger 1");
		p2.setName("Passenger 2");

		p1.start();
		p2.start();

	}

}
