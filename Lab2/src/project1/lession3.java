package project1;

import java.util.Scanner;

public class lession3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("������� �����: ");
		int number = in.nextInt();
		int n = number;
		if(n%5==2 && n%7==1) {
			System.out.println("���� ����� ������������� ��������");
		}
		else {
			System.out.println("���� ����� �� ������������� ��������");
		}
	}

}
