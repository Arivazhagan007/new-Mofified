package com.training.model;

public class BookTourDetails {

	private int bookTourId;
	private int tourId;
	private int customerId;
	private int countOfMembers;
	private double totalAmount;
	
	public BookTourDetails() {
		super();
	}
	
	public BookTourDetails(int tourId, int customerId, int countOfMembers, double totalAmount) {
		super();
		this.tourId = tourId;
		this.customerId = customerId;
		this.countOfMembers = countOfMembers;
		this.totalAmount = totalAmount;
	}

	public BookTourDetails(int bookTourId, int tourId, int customerId, int countOfMembers, double totalAmount) {
		super();
		this.bookTourId = bookTourId;
		this.tourId = tourId;
		this.customerId = customerId;
		this.countOfMembers = countOfMembers;
		this.totalAmount = totalAmount;
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
	@Override
	public String toString() {
		return "BookTour [bookTourId=" + bookTourId + ", TourId=" + tourId + ", customerId=" + customerId
				+ ", countOfMembers=" + countOfMembers + ", totalAmount=" + totalAmount + "]";
	}
}
