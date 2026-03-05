package com.msedcl.main;

import com.msedcl.util.stringUtils;

public class StringOperationMains {

	public static void main(String[] args) {
	  stringUtils str = new stringUtils();
	  System.out.println(str.concat("Punam", "Nikam"));
	  System.out.println(str.len("Punam"));
	  System.out.println(str.comparestr("Punam", "Nikam"));
	}

}
