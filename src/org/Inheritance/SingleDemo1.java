package org.Inheritance;

public class SingleDemo1 extends SingleDemo {
	
	private void test1() {
System.out.println("i am singledemo1");
	}
	
	public static void main(String[] args) {
		SingleDemo1 fox = new SingleDemo1();
		fox.m1(23);
		fox.m2(6347, 4726);
		fox.test1();
		fox.m1(23);
		
		
		
	}
	
	

}
