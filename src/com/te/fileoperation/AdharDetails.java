package com.te.fileoperation;

import java.io.Serializable;

public class AdharDetails implements Serializable{
	
	String name;
	int num;
	String address;
	
	public AdharDetails(String name, int num, String address) {
		this.name = name;
		this.num = num;
		this.address = address;
	}
}
