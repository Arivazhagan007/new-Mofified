package com.training.process;

import java.util.Map;

import com.training.iface.Command;

public class CustomerRegisterView implements Command {
	@Override
	public String execute(Map<String, String> map) {
		return "CustomerRegister.jsp";
	}
}
