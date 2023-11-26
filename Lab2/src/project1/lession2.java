package project1;
import java.util.Scanner;

@SuppressWarnings("unused")
public class lession2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("¬ведите число: ");
		int number = in.nextInt();
		int n = number;
		if(n%3==0) {
			System.out.println("¬аше число делитс€ на три");
		}
		else {
			System.out.println("¬аше число не делитьс€ на три");
		}		
	}

}
