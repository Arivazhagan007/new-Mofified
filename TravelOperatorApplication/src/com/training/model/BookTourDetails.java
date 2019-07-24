package com.training.model;


public class BookTourDetails {
	
	private int bookTourId;
	private int tourId;
	private int customerId;
	private int countOfMembers;
	private double totalAmount;
	private String amount;
	public BookTourDetails() {
		super();
	}
	
	
	public BookTourDetails(int bookTourId, int tourId, int customerId, int countOfMembers, double totalAmount,
			String amount) {
		super();
		this.bookTourId = bookTourId;
		this.tourId = tourId;
		this.customerId = customerId;
		this.countOfMembers = countOfMembers;
		this.totalAmount = totalAmount;
		this.amount = amount;
	}


	public BookTourDetails(int tourId, int customerId, int countOfMembers, double totalAmount, String amount) {
		super();
		this.tourId = tourId;
		this.customerId = customerId;
		this.countOfMembers = countOfMembers;
		this.totalAmount = totalAmount;
		this.amount = amount;
	}


	public int getBookTourId() {
		return bookTourId;
	}
	public void setBookTourId(int bookTourId) {
		this.bookTourId = bookTourId;
	}
	public int getTourId() {
		return tourId;
	}
	public void setTourId(int tourId) {
		this.tourId = tourId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getCountOfMembers() {
		return countOfMembers;
	}
	public void setCountOfMembers(int countOfMembers) {
		this.countOfMembers = countOfMembers;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}


	@Override
	public String toString() {
		return "BookTourDetails [bookTourId=" + bookTourId + ", tourId=" + tourId + ", customerId=" + customerId
				+ ", countOfMembers=" + countOfMembers + ", totalAmount=" + totalAmount + ", amount=" + amount + "]";
	}

}
