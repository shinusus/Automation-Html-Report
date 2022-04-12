package com.Demoautomation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {
	public static Properties p;
	public void get_url() throws IOException {
		File f= new File("C:\\Users\\Windows\\eclipse-workspace\\Automatingtest\\src\\main\\java\\com\\Automatingtest\\Testdata.properties");
		FileInputStream fis= new FileInputStream(f);
		  p= new Properties();
		  p.load(fis);
	}
	public String config_url() {
		String url = p.getProperty("url");
		return url;
	}
	public String get_email() {
		String email = p.getProperty("email");
		return email;
	}
	public String get_password() {
		String password = p.getProperty("password");
		return password;
	}
	

}
