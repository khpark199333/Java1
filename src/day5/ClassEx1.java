package day5;

import day4.Test3;
import day5_1.DefaultClassEx1;

public class ClassEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test3.main(null);
		DefaultClassEx1.main(null);
		DefaultClassEx1.main(null);
		/*DefaultClassEx2는 다른 패키지에 있는 클래스인데 접근 제한자 default
		 * 사용할수 없기 때문에 에러발생
		 */
		//DefaultClassEx2.main(null);
		Point p1 = new Point();
		p1.x1 = 10;
		p1 = new Point(1,2);
		//p1 = new point(3,4,5);
		//p1.x2 = 10; Point클래스의 x2는 private 이기 때문에 다른 클래스에서 사용할수 없다
	}
}
//point : 2차원 자표평면에서 점 1개를 나타내는 클래스
class Point{
	int x1; //x축의 좌표
	int y1; //y축의 좌표
	private int x2;
	private int y2;
	public int x3;
	public int y3;
	public point() {
		x1 = x2 = x3 = 0;
		y1 = y2 = y3 = 0;
		System.out.println("point의 기본 생성자 호출");
	}
	//생성자 오버로딩
	public point(int x, int y) {
		x1 = x2 = x3 = x;
		y1 = y2 = y3 = y;
		System.out.println("point의 생성자 오버로딩 호출");
	}
}