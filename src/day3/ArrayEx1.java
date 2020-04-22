package day3;

import java.util.Scanner;

public class ArrayEx1 {

	public static void main(String[] args) {
		/* 배열 :(같은의미와)같은 자료형을 가진 변수들의 집합
		 * -일반변수를 10개 이용해서는 반복문을 사용할 수 없다.
		 * -효율적으로 변수들을 관리하기 위해서
		 * 배열이 없으면 아래와 같이 5개의 정보를 입력받아 저장할려고 하면 5개의 변수를 선언하고
		 * Scanner를 통해 5번 직접 입력받는 코드를 작성해야한다. 하지만 배열을 이용하면
		 * 효율적으로 입력받는 코드를 작성할 수 있다.
		 */
		/*n1 = scan.nextInt();
		n2 = scan.nextInt();
		n3 = scan.nextInt();
		n4 = scan.nextInt();
		n5 = scan.nextInt();
		*/
		
		int []arr1, arr2; //arr1과 arr2는 둘다 배열
		int arr3[], arr4; //arr3는 배열 arr4는 일반 변수
		arr1 = new int[5];
		arr1[0]=1;
		arr1[2]=3;	
		for(int i=0; i<5; i++) {
		
		}
		for(int i=0; i<arr1.length; i++) {
		}
	}

}
