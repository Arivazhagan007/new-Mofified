package com.training.process;

import java.util.Map;

import com.training.iface.Command;

public class ViewEmployeeLogin implements Command {

	@Override
	public String execute(Map<String, String> map) {
		String result = "EmployeeLogin.jsp";
		return result;
	}

}
