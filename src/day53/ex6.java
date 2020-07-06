package day53;

import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		char ch = 'N';
		while(ch != 'y' && ch != 'Y') {
			System.out.printf("문자를 입력하세요 : ");
			ch = scan.next().charAt(0);
		}
		scan.close();
	}

}
