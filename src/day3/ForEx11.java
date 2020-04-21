package day3;

public class ForEx11 {

	public static void main(String[] args) {
		/* *          i=1 *=1
		 * **         i=2 *=2
		 * ***        i=3 *=3
		 * ****       i=4 *=4
		 * *****      i=5 *=5
		 * ******     i=6 *=6
		 *                *=i
		 */
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();

		}

	}
}
