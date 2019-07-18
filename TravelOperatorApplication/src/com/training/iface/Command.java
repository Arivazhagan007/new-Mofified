package com.training.iface;


import java.util.Map;



public interface Command {
	
//	public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, java.io.IOException; 
	public Map<String, Object> execute(Map<String, String> map);
}
