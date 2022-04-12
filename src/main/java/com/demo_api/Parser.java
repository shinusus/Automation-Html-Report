package com.demo_api;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class Parser {
	public static void main(String[] args) throws IOException, ParseException {
		File f= new File("C:\\Users\\Windows\\eclipse-workspace\\Automatingtest\\Payload.json");
		FileReader reader= new FileReader(f);
		JSONParser parser=new JSONParser();
		Object object = parser.parse(reader);
		JsonObject jsonobj=(JsonObject) object;
		Object obj= jsonobj.get("name");
		String string = obj.toString();
		System.out.println("name"+ string);
		
	}

}
