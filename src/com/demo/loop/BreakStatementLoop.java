package com.demo.loop;

public class BreakStatementLoop {
	public static void main(String args[]) {
		System.out.println("BreakSatement using for loop:");
		{
			for (int i = 1; i <= 10; i++) {

				if (i == 6) {
					break;
				}

				System.out.println("Print value: " + i);
			}
		}
	}

}
