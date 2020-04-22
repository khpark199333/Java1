package day4;

import java.util.Scanner;

public class Text1 {

	public static void main(String[] args) {
		/*두 정수와 문자하나를 입력받아 출력하는 코드를 작성하세여
		 * 두 정수와 문자 하나를 입력받아 > 정수형변수2개를 선언하고,문자형 변수1개를 선언후 Scanner를 통해
		 * 정수와 문자를 입력받을 수 있다.
		 * 출력하는 > System.out.println을 활용할 수 있다.
		 */
		
		int num1, num2;
		//char op;변수선언
		String str;
		Scanner scan = new Scanner(System.in);
		System.out.print("두 정수와 문자를 입력하세요.(예:1 + 2) :");
		num1 = scan.nextInt();
		//op = scan.next().charAt(0);
		str = scan.next();
		num2 = scan.nextInt();
		//System.out.println(""+num1 + op + num2);
		//System.out.printf("%d %c %d\n", num1, op, num2);
		System.out.println("" + num1 + "" + str + "" + num2);
		System.out.printf("%d %s %d\n", num1, str, num2);
		scan.close();
		/*입력받은 문자가 +이면 두 수의 합을 출력하고
		 * -이면 두 수의 차를 출력하고
		 * /이면 두 수의 나눈 결과를 출력하고
		 * *이면 두 수의 곱한 결과를 출력하고
		 * %이면 두 수의 나머지 결과를 출력하는 코드를 작성하세요.
		 */
		
	}

}
