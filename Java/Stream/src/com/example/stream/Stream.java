package com.example.stream;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Stream {

	public static void main(String[] args) {
		List<String> employee = new ArrayList<String>();
		employee.add("Rituraj");
//		employee.add("Peter");
//		employee.add("Alexa");
		employee.add("Rituraj");
		
		
		Long count = employee.stream().count();
		System.out.println(count);
		
		List<String> e = employee.stream().distinct().map((emp)->emp.toUpperCase()).collect(Collectors.toList());

//		for(String e1 : e)
//		{
//			System.out.println(e1);
//		}
		
		boolean result = employee.stream().allMatch(n->n.equals("Peter"));
		
		System.out.println(result);
	}

}
