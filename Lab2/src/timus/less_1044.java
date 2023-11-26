package timus;

import java.util.Scanner;

public class less_1044 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Введите число цифр в билете");
		int a=in.nextInt();
		int[] m = {10, 670, 55252, 4816030};
		int c = a/2-1;
		System.out.println(m[c]);
	}

}
