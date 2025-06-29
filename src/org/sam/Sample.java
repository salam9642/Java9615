package org.sam;

public class Sample {
	
	public static String name = "SmartSkills";

	private void m1() {
		System.out.println("Method-----1");
	}
	
	
	public static void main(String[] args) {
		
		Sample s = new Sample();
		s.m1();
		
		
		int a = 10;
		System.out.println(a);
		
		System.out.println(name);
		
	}

}
