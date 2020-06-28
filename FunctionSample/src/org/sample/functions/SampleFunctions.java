package org.sample.functions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class SampleFunctions {

	public static void main(String args[]) {
		SampleFunctions sample = new SampleFunctions();
		int s = sample.sum(12, 26);// arguments while calling fn
		System.out.println("The value returned is " + s);

	}

	public int sum(int a, int b) {
		int c = a + b;
		try {
			int d = 10 / 0;
		} catch (Exception e) {
			System.out.println("Exception consumed");
		} finally {
			System.out.println("Within finally block");
		}

		return c;
	}

}
