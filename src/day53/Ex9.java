package day53;

public class Ex9 {

	public static void main(String[] args) {
		// 1부터 10까지 합을 구하는 코드를 메서드를 만들어서 작성하세요.
		System.out.println(sum(1,10));
		System.out.println(sum(6,10));
	}
	/* 기능 정리 : min부터 max까지 합을 구하는 메서드(재사용성을 높이기 위해)
	 * 매개변수 :  int min,int max
     * 리턴타입 :  산술 연산 결과 > 정수 >int
	 * 메소드명 :  sum
	 * */
	public  static int sum(int min,int max) {
		int res =0;
		for(int i=min;i<=max;i++) {
			res +=i;
		}
		return res;
	}
	
}
