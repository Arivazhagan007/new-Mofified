package com.training.process;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.training.SqlConnection;
import com.training.iface.Command;
import com.training.iface.TravelConstant;
import com.training.model.BookTourDetails;
import com.training.model.Customer;

public class BookTour extends Customer implements Command {

	@Override
	public Map<String, Object> execute(Map<String, String> map) {
		Map<String, Object> map2 = new HashMap<>();
		ArrayList<BookTourDetails> list = new ArrayList<>();
		Connection connection = SqlConnection.getSqlConnection();
		String uri = "TourBookedReceipt.jsp";
		map2.put(TravelConstant.uriPath, uri);
		String id = map.get("selectedTourId");
		Integer tourId = Integer.parseInt(id);
		int customerId = super.getCustomerId();
		String count = map.get("countValue");
		Integer countOfMembers = Integer.parseInt(count);
		double totalAmount;
		double amountPerPerson = 0;
		String tourSql = "select * from Tour where tourId = ?";
		PreparedStatement tourPreparedStatement = null;
		
		try {
			tourPreparedStatement = connection.prepareStatement(tourSql);
			tourPreparedStatement.setInt(1, tourId);
			ResultSet resultSet = tourPreparedStatement.executeQuery();
				while (resultSet.next()) {
					amountPerPerson = resultSet.getDouble("amountPerPerson");
				}
		} catch (Exception e1) {
			e1.printStackTrace();
		}finally {
			try {
				tourPreparedStatement.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		totalAmount = amountPerPerson*countOfMembers;
		BookTourDetails bookTourDetails = new BookTourDetails(tourId, customerId, countOfMembers, totalAmount);
		list.add(bookTourDetails);
		
		String bookTourSql = "insert into BookTour values(?,?,?,?,?)";
		PreparedStatement bookTourPreparedStatement = null;
		try {
			bookTourPreparedStatement = connection.prepareStatement(bookTourSql);
			bookTourPreparedStatement.setInt(1, bookTourDetails.getBookTourId());
			bookTourPreparedStatement.setInt(2, bookTourDetails.getTourId());
			bookTourPreparedStatement.setInt(3, bookTourDetails.getCustomerId());
			bookTourPreparedStatement.setInt(4, bookTourDetails.getCountOfMembers());
			bookTourPreparedStatement.setDouble(5, bookTourDetails.getTotalAmount());
			bookTourPreparedStatement.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				connection.close();
				bookTourPreparedStatement.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		map2.put(TravelConstant.list, list);
		return map2;
	}

}
