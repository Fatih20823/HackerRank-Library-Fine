package com.main;

public class Application {

	public static void main(String[] args) {
		int d1 = 10;
		int m1 = 10;
		int y1 = 2021;
		int d2 = 10;
		int m2 = 11;
		int y2 = 2020;
		int fine = 0;
		if (y1>y2) fine = 10000;
		else if (m1>m2 && y1==y2) fine = (m1-m2)*500;
			else if (d1>d2 && y2==y1 && m2==m1) fine=(d1-d2)*15;
		
		System.out.println("fine: "+fine);

	}

}
