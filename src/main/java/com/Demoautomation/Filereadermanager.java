package com.Demoautomation;

public class Filereadermanager {
private Filereadermanager() {
		
	}
	public static Filereadermanager get_instance_Frm() {
		Filereadermanager frm=new Filereadermanager();
		return frm;
	}
	public Configuration_Reader get_instance_cr() {
		Configuration_Reader cr=new Configuration_Reader();
		return cr;
	}
	
	

}
