package com.training.process;

import java.util.Map;

import com.training.iface.Command;

public class ViewCustomerLogin implements Command {

	@Override
	public String execute(Map<String, String> map) {
		return "CustomerLogin.jsp";
	}

}
