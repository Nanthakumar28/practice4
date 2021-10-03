package com.te.stringmethods;

public class StrMethods {

	public static void main(String[] args) {

		String str = "Developer";
		System.out.println(str);

		// String Methods
		System.out.println("String length =" + str.length());
		System.out.println("character =" + str.charAt(4));
		System.out.println("uppercase =" + str.toUpperCase());
		System.out.println("lowercase =" + str.toLowerCase());
		System.out.println("index =" + str.indexOf('o'));
		System.out.println("indexstart =" + str.indexOf('r', 1));
		System.out.println("sunstring =" + str.substring(3));
		System.out.println("startswith =" + str.startsWith("Ban"));
		System.out.println("endswidth =" + str.endsWith("e"));
		
		String str1 = "      Junior Developer";
		System.out.println(str1.trim());

		String str2 = "this is java method";
		String[] s1 = str2.split(" ");
		for (int i = 0; i < s1.length; i++) {
			System.out.println(s1[i]);
		}

		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}

	}

}
