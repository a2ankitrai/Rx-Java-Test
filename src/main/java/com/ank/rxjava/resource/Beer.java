package com.ank.rxjava.resource;

public class Beer {

	String name;
	Quality quality;
	
	public enum Quality{
		POOR("POOR"),
		OK("OK"),
		AWESOME("AWESOME");
		
		String value;
		private Quality(String value) {
			this.value = value;
		}
	}
	
	public Beer() {}
	
	public Beer(String name, Quality quality) {
		this.name = name;
		this.quality = quality;
	}
	
	public String toString() {
		return "["+name+" :: "+ quality.value +"]";
	}
}
