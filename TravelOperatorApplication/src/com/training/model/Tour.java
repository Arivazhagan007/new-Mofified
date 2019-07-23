package com.training.model;

import java.time.LocalDate;

public class Tour {

	private int tourId;
	private String tourCode;
	private String tourName;
	private String boardingPlace;
	private String destinationPlace;
	private LocalDate startingDate1;
	private LocalDate endingDate1;
	private String startingDate;
	private String endingDate;
	private String placesCovered;
	private double amountPerPerson;
	private String amountPerPerson1;
	private int employeeId;
	
	public Tour() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Tour(int tourId, String tourCode, String tourName, String boardingPlace, String destinationPlace,
			String startingDate, String endingDate, String placesCovered, double amountPerPerson) {
		super();
		this.tourId = tourId;
		this.tourCode = tourCode;
		this.tourName = tourName;
		this.boardingPlace = boardingPlace;
		this.destinationPlace = destinationPlace;
		this.startingDate = startingDate;
		this.endingDate = endingDate;
		this.placesCovered = placesCovered;
		this.amountPerPerson = amountPerPerson;
	}
	public Tour(String tourCode, String tourName, String boardingPlace, String destinationPlace, String startingDate,
			String endingDate, String placesCovered, double amountPerPerson, int employeeId) {
		super();
		this.tourCode = tourCode;
		this.tourName = tourName;
		this.boardingPlace = boardingPlace;
		this.destinationPlace = destinationPlace;
		this.startingDate = startingDate;
		this.endingDate = endingDate;
		this.placesCovered = placesCovered;
		this.amountPerPerson = amountPerPerson;
		this.employeeId = employeeId;
	}
	
	public Tour(int tourId, String tourCode, String tourName, String boardingPlace, String destinationPlace,
			LocalDate startingDate1, LocalDate endingDate1, String placesCovered, double amountPerPerson) {
		super();
		this.tourId = tourId;
		this.tourCode = tourCode;
		this.tourName = tourName;
		this.boardingPlace = boardingPlace;
		this.destinationPlace = destinationPlace;
		this.startingDate1 = startingDate1;
		this.endingDate1 = endingDate1;
		this.placesCovered = placesCovered;
		this.amountPerPerson = amountPerPerson;
	}
	
	
	
	public Tour(int tourId, String tourCode, String tourName, String boardingPlace, String destinationPlace,
			LocalDate startingDate1, LocalDate endingDate1, String startingDate, String endingDate,
			String placesCovered, double amountPerPerson) {
		super();
		this.tourId = tourId;
		this.tourCode = tourCode;
		this.tourName = tourName;
		this.boardingPlace = boardingPlace;
		this.destinationPlace = destinationPlace;
		this.startingDate1 = startingDate1;
		this.endingDate1 = endingDate1;
		this.startingDate = startingDate;
		this.endingDate = endingDate;
		this.placesCovered = placesCovered;
		this.amountPerPerson = amountPerPerson;
	}
	
	//All
	public Tour(int tourId, String tourCode, String tourName, String boardingPlace, String destinationPlace,
			LocalDate startingDate1, LocalDate endingDate1, String startingDate, String endingDate,
			String placesCovered, double amountPerPerson, String amountPerPerson1) {
		super();
		this.tourId = tourId;
		this.tourCode = tourCode;
		this.tourName = tourName;
		this.boardingPlace = boardingPlace;
		this.destinationPlace = destinationPlace;
		this.startingDate1 = startingDate1;
		this.endingDate1 = endingDate1;
		this.startingDate = startingDate;
		this.endingDate = endingDate;
		this.placesCovered = placesCovered;
		this.amountPerPerson = amountPerPerson;
		this.amountPerPerson1 = amountPerPerson1;
	}
	
	public int getTourId() {
		return tourId;
	}
	public void setTourId(int tourId) {
		this.tourId = tourId;
	}
	public String getTourCode() {
		return tourCode;
	}
	public void setTourCode(String tourCode) {
		this.tourCode = tourCode;
	}
	public String getTourName() {
		return tourName;
	}
	public void setTourName(String tourName) {
		this.tourName = tourName;
	}
	public String getBoardingPlace() {
		return boardingPlace;
	}
	public void setBoardingPlace(String boardingPlace) {
		this.boardingPlace = boardingPlace;
	}
	public String getDestinationPlace() {
		return destinationPlace;
	}
	public void setDestinationPlace(String destinationPlace) {
		this.destinationPlace = destinationPlace;
	}
	public String getStartingDate() {
		return startingDate;
	}
	public void setStartingDate(String startingDate) {
		this.startingDate = startingDate;
	}
	public String getEndingDate() {
		return endingDate;
	}
	public void setEndingDate(String endingDate) {
		this.endingDate = endingDate;
	}
	
	public LocalDate getStartingDate1() {
		return startingDate1;
	}
	public void setStartingDate1(LocalDate startingDate1) {
		this.startingDate1 = startingDate1;
	}
	public LocalDate getEndingDate1() {
		return endingDate1;
	}
	public void setEndingDate1(LocalDate endingDate1) {
		this.endingDate1 = endingDate1;
	}
	public String getPlacesCovered() {
		return placesCovered;
	}
	public void setPlacesCovered(String placesCovered) {
		this.placesCovered = placesCovered;
	}
	public double getAmountPerPerson() {
		return amountPerPerson;
	}
	public void setAmountPerPerson(double amountPerPerson) {
		this.amountPerPerson = amountPerPerson;
	}
	public String getAmountPerPerson1() {
		return amountPerPerson1;
	}
	public void setAmountPerPerson1(String amountPerPerson1) {
		this.amountPerPerson1 = amountPerPerson1;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	@Override
	public String toString() {
		return "Tour [tourId=" + tourId + ", tourCode=" + tourCode + ", tourName=" + tourName + ", boardingPlace="
				+ boardingPlace + ", destinationPlace=" + destinationPlace + ", startingDate1=" + startingDate1
				+ ", endingDate1=" + endingDate1 + ", startingDate=" + startingDate + ", endingDate=" + endingDate
				+ ", placesCovered=" + placesCovered + ", amountPerPerson=" + amountPerPerson + ", amountPerPerson1="
				+ amountPerPerson1 + ", employeeId=" + employeeId + "]";
	}
	
}
