package com.training.factory;

import com.training.iface.Command;

public class Factory {

	public static Command getClass(String classPackageName){
		
		Command command = null;
	
			Class class1;
			try {
				class1 = Class.forName(classPackageName);
				command = (Command) class1.newInstance();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	
		return command;
		
	}	
}
