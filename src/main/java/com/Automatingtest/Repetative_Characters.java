package com.Automatingtest;
import java.util.*;
import java.util.Map.Entry;

public class Repetative_Characters {
	public static void main(String[] args) {
		String s="people";
		String[] split=s.split("");
		Map<String,Integer>map=new LinkedHashMap<String,Integer>();
		for(String word:split){
		if(map.containsKey(word)){
		Integer value=map.get(word);
		map.put(word,value+1);
		}
		else{
		map.put(word,1);
		}
		}
		Set<Entry<String,Integer>>entrySet=map.entrySet();
		for(Entry<String,Integer>entry:entrySet){
		if(entry.getValue()>1)
		{
		System.out.println(entry);
		}
		}
		}
		
	}


