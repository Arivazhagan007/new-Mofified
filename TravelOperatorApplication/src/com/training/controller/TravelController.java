package com.training.controller;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.servlet.*;
import javax.servlet.http.*;
import com.training.factory.Factory;
import com.training.iface.Command;
import com.training.iface.TravelConstant;

/**
 * Servlet implementation class TravelController
 */
public class TravelController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
	
	Properties properties = null;
	
    public TravelController() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
    @Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		InputStream inputStream = null;
		ClassLoader classLoader=Thread.currentThread().getContextClassLoader();
		inputStream = classLoader.getResourceAsStream("Command.properties");
		properties = new Properties();
		try {
			properties.load(inputStream);	
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				inputStream.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
        
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, NullPointerException {
		process(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}
	
	protected void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {

		Map<String, String> map=new HashMap<>();
		String paramValues=null;
		Enumeration<String> paramNames=request.getParameterNames();

		while(paramNames.hasMoreElements()){

		String paramName= paramNames.nextElement();
		paramValues=request.getParameter(paramName);
		map.put(paramName, paramValues);
		}
//		/TravelOperatorApplication/CustomerLogin.in

		String uriPath = request.getRequestURI();
		String[] uriSplit = uriPath.split("/");
		String classPackageName = properties.getProperty(uriSplit[uriSplit.length-1]);
		Command command = Factory.getClass(classPackageName);
//		String responsePath = command.execute(request,response);
//		String responsePath = command.execute(map);
		Map<String,Object> map1 = command.execute(map);
		String responsePath = map1.get(TravelConstant.uriPath).toString();
		request.setAttribute("list", map1.get(TravelConstant.list));
		if(responsePath!=null){
			RequestDispatcher dispatcher = request.getRequestDispatcher(responsePath);
			dispatcher.forward(request, response);
		}else{
			request.getRequestDispatcher("error").forward(request, response);
		}
	
	}

}
