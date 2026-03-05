package com.msedcl.util;

public class stringUtils {

	public static String concat(String a, String b) {
		return a +b;
	}
	
	public static int len(String a) {
		return a.length();
	}
	
	public static int comparestr(String a, String b) {
		 int flag=a.compareToIgnoreCase(b);
		
		return flag;
	}
}
