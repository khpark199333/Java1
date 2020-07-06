package day53;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("점수 : ");
		
		int grade=scan.nextInt();
		if(grade>=95 && grade<=100) {
			System.out.println("A+");
		}else if(grade>=90 && grade<95) {
			System.out.println("A");
		}else if(grade>=85 && grade<90) {
			System.out.println("B+");
		}else if(grade>=80 && grade<85) {
			System.out.println("B+");
		}else if(grade>=75 && grade<80) {
			System.out.println("C+");
		}else if(grade>=70 && grade<75) {
			System.out.println("C");
		}else if(grade>=65 && grade<70) {
			System.out.println("D+");
		}else if(grade>=60 && grade<65) {
			System.out.println("D");
		}else{
			System.out.println("F");
		}
	}

}
