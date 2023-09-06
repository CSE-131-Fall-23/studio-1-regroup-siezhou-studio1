package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("Year: ");
		int year = in.nextInt();
		
		boolean divFour = ((year%4)==0);
		boolean divHundred = ((year%100)==0);
		boolean divFourHundred = ((year%400)==0);
		
		boolean leapYear = (divFourHundred) || (!divHundred && divFour);
		System.out.println("Leap Year: "+leapYear);
	}

}
