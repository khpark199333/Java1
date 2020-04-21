package day3;

public class DoWhileEx1 {

	public static void main(String[] args) {
		/* do while문은 무조건 1번은 실행된다.
		 * do{
		 * 			실행문;
		 * while(조건식);
		 */

		 int menu = 4;
		 Scanner scan = new Scanner(System.in);
		 do{
			System.out.println("1.삼겹살");
			System.out.println("2.항정살");
			System.out.println("3.꽃등심");
			System.out.println("4.종료");
			System.out.print("메뉴를 입력하세요 :");
			menu = scan.nextInt();
		}while(menu != 4)
		scan.close();
	}

}
