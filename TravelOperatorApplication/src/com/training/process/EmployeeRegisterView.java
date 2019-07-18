package com.training.process;

import java.util.Map;

import com.training.iface.Command;

public class EmployeeRegisterView implements Command {

	@Override
	public String execute(Map<String, String> map) {
		// TODO Auto-generated method stub
		return "EmployeeRegister.jsp";
	}

}
