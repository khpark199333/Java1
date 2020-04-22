package day3;

public class ArrayEx2 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		num1 = num2;
		System.out.println(num1);
		int arr1[] = new int[] {1,2,3,4};
		int arr2[] = new int[] {9,8,7,6};
		arr2[0] = 1;
		/*arr2가 만든배열을 arr1과arr2가 공유하게됨
		 * arr1에 있던 배열이 사라짐
		 */
		for(int i=0; i<arr1.length; i++) {
			//arr1[i] = arr2[i];
			int tmp = arr1[i];
			arr1[i] = arr2[i];
			arr2[i] = tmp;
		}
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i]+"");
			
		}
		System.out.println();
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i]+"");
		}
		System.out.println();
	}

}
