package org.Inheritance;

public class MultipleDemo3 implements MultipleDemo1,MultipleDemo2{

	@Override
	public void insurance() {
		System.out.println("important");
	}

	@Override
	public void interst() {
		System.out.println("profitable");
	}

	@Override
	public void profit() {
		System.out.println("happy");
	}
public static void main(String[] args) {
	MultipleDemo3 n  = new MultipleDemo3();
	n.interst();
	n.profit();
	n.insurance();
}
}
