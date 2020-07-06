package day53;

public class Ex3 {

	public static void main(String[] args) {
		//구구단 출력 예제
		 for(int i=2; i<=9; i++) {
			 for(int j=1;j<=9;j++) {
				 System.out.print(j+"x"+i + "=" + j*i );
				 System.out.println();
			 }
			 System.out.println();
		 }
	}

}
