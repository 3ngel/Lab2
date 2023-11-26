package project1;

import java.util.Scanner;

public class lession6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("¬ведите число: ");
		int number = in.nextInt();
		int n = number;
		int h = n/1000;
		System.out.println("¬ вашем число столько-то тыс€ч: "+h);
	}

}
