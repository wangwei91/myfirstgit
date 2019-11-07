package cn.wangwei.test;

import java.io.PrintStream;

public class Test {
	public static void main(String[] args) {
		int a = 10;
		System.out.println(a);
	}
	
	public void method(int a) {
		System.setOut(new PrintStream(System.out) {
				@Override
				public void println(String str) {
					
				}
		});
	}
}
