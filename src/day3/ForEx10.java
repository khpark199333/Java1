package day3;

public class ForEx10 {

	public static void main(String[] args) {
		/* 구구단 2단부터 9단까지 출력하는 코드를 작성하세요.
		 * 7단 출력 예제를 활용
		 * 반복문에 이름을 붙여서 구구단 전체를 출력하는 코드에서 2단만 출력하도록 수정
		 */
		Loop1 : for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.println(i+"x"+j+"="+i*j);
				if(i==9) {
					break Loop1;
				}
			}
		}
		System.out.println();
	}

}
