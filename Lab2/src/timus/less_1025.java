package timus;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class less_1025 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("������� �����");
		int k = in.nextInt();
		int[] mass= new int[k];
		for(int i=0; i<k; i++) {
			System.out.println("��������� � ������ "+i);
			mass[i]=in.nextInt();
		}
		int kV=k/2+1;
		int count = 0;
		Arrays.sort(mass);
		for(int i=0; i<kV;i++) {
			int m =mass[i]/2+1;
			count=count+m;
		}
		
		System.out.println("������� ������� "+count);
	}
}
