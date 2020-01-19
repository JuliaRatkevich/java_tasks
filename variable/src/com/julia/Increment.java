package com.julia;

public class Increment {

	public static void main(String[] args) {
		int Petya = 2, Mascha = 3;

		int allApples = Petya + Mascha;
		System.out.println(allApples);
		// apples

		int increment = 8;
		increment++; //---- increment = increment + 1
		++increment;
		System.out.println(increment);
		System.out.println(++increment);//11
		System.out.println(increment++);//11
		System.out.println(increment);//12
	}
}
