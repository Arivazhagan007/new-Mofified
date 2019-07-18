package com.training.process;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.util.HashMap;
import java.util.Map;

import com.training.SqlConnection;
import com.training.iface.Command;
import com.training.iface.TravelConstant;
import com.training.model.Tour;

public class AddTour implements Command {

	@Override
	public Map<String, Object> execute(Map<String, String> map) {
		Connection con = SqlConnection.getSqlConnection();
		Map<String, Object> map2 = new HashMap<>();
		String uri = "EmployeeHome.jsp";
		map2.put(TravelConstant.uriPath, uri);
		String tourCode = map.get("tourCode");
		String tourName = map.get("tourName");
		String boardingPlace = map.get("boardingPlace");
		String destinationPlace = map.get("destinationPlace");
		String startingDate = map.get("startingDate");
//		LocalDate startingDate = LocalDate.parse(strtDate);
		String endingDate = map.get("endingDate");
//		LocalDate endingDate = LocalDate.parse(endDate);
		String placesCovered = map.get("placesCovered");
		String amtPerPerson = map.get("amountPerPerson");
		double amountPerPerson = Double.parseDouble(amtPerPerson);
		//Tour tour = new Tour(tourCode, tourName, boardingPlace, destinationPlace, startingDate, endingDate, placesCovered, amountPerPerson);
		Tour tour = new Tour(tourCode, tourName, boardingPlace, destinationPlace, startingDate, endingDate, placesCovered, amountPerPerson);
		String tourSql = "insert into Tour values(?,?,?,?,?,?,?,?,?)";
		 PreparedStatement tourPreparedStatement = null;
		 try {
			tourPreparedStatement = con.prepareStatement(tourSql);
			tourPreparedStatement.setInt(1, tour.getTourId());
			tourPreparedStatement.setString(2, tour.getTourCode());
			tourPreparedStatement.setString(3, tour.getTourName());
			tourPreparedStatement.setString(4, tour.getBoardingPlace());
			tourPreparedStatement.setString(5, tour.getDestinationPlace());
			tourPreparedStatement.setDate(6, Date.valueOf(tour.getStartingDate()));
			tourPreparedStatement.setDate(7, Date.valueOf(tour.getEndingDate()));
			tourPreparedStatement.setString(8, tour.getPlacesCovered());
			tourPreparedStatement.setDouble(9, tour.getAmountPerPerson());
			tourPreparedStatement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				tourPreparedStatement.close();
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return map2;
	}
	
//	Connection con = null;
//	
//	public AddTour() {
//		super();
//		con = SqlConnection.getSqlConnection();
//	}

//	@Override
//	public String execute(HttpServletmap map, HttpServletResponse response) throws ServletException, IOException {
//		String result = "index.jsp";
//		String tourCode = map.get("tourCode");
//		String tourName = map.get("tourName");
//		String boardingPlace = map.get("boardingPlace");
//		String destinationPlace = map.get("destinationPlace");
//		String strtDate = map.get("startingDate");
//		LocalDate startingDate = LocalDate.parse(strtDate);
//		String endDate = map.get("endingDate");
//		LocalDate endingDate = LocalDate.parse(endDate);
//		String placesCovered = map.get("placesCovered");
//		String amtPerPerson = map.get("amountPerPerson");
//		double amountPerPerson = Double.parseDouble(amtPerPerson);
//		Tour tour = new Tour(tourCode, tourName, boardingPlace, destinationPlace, startingDate, endingDate, placesCovered, amountPerPerson);
//		addTour(tour);
//		return result;
//	}

//	@Override
//	public String execute(Map<String, String> map){
//		String result = "EmployeeHome.jsp";
//		String tourCode = map.get("tourCode");
//		String tourName = map.get("tourName");
//		String boardingPlace = map.get("boardingPlace");
//		String destinationPlace = map.get("destinationPlace");
//		String strtDate = map.get("startingDate");
//		LocalDate startingDate = LocalDate.parse(strtDate);
//		String endDate = map.get("endingDate");
//		LocalDate endingDate = LocalDate.parse(endDate);
//		String placesCovered = map.get("placesCovered");
//		String amtPerPerson = map.get("amountPerPerson");
//		double amountPerPerson = Double.parseDouble(amtPerPerson);
//		Tour tour = new Tour(tourCode, tourName, boardingPlace, destinationPlace, startingDate, endingDate, placesCovered, amountPerPerson);
//		addTour(tour);
//		return result;
//	}
//	
//	public int addTour(Tour tour) {
//		
//		String tourSql = "insert into Tour values(?,?,?,?,?,?,?,?,?)";
//		 PreparedStatement tourPreparedStatement = null;
//		 int addValue = 0;
//		 
//		 try {
//			tourPreparedStatement = con.prepareStatement(tourSql);
//			tourPreparedStatement.setInt(1, tour.getTourId());
//			tourPreparedStatement.setString(2, tour.getTourCode());
//			tourPreparedStatement.setString(3, tour.getTourName());
//			tourPreparedStatement.setString(4, tour.getBoardingPlace());
//			tourPreparedStatement.setString(5, tour.getDestinationPlace());
//			tourPreparedStatement.setDate(6, Date.valueOf(tour.getStartingDate()));
//			tourPreparedStatement.setDate(7, Date.valueOf(tour.getEndingDate()));
//			tourPreparedStatement.setString(8, tour.getPlacesCovered());
//			tourPreparedStatement.setDouble(9, tour.getAmountPerPerson());
//			addValue = tourPreparedStatement.executeUpdate();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}finally {
//			try {
//				tourPreparedStatement.close();
//				con.close();
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
//		return addValue;
//	}




}
