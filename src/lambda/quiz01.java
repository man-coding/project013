package lambda;

//코드를 람다식으로 변경하라
public class quiz01 {

	public static void main(String[] args) {

		// 클래스
		Mynumber number1 = new MynumberImpl();
		System.out.println(number1.max(10, 20));

		// 람다식
		Mynumber number2 = (x, y) -> x > y ? x : y;
		System.out.println(number2.max(4, 2));

		// 익명클래스
		Mynumber number3 = new Mynumber() {

			@Override
			public int max(int x, int y) {
				int max = 0;
				if (x >= y) {
					max = x;
				} else if (y > x) {
					max = y;
				}
				return max;

			}
		};
		System.out.println(number3.max(4, 23));
	}
}

//함수형 인터페이스 선언
interface Mynumber {
	// 더 큰 값을 구하는 메소드 선언
	int max(int x, int y);
}

class MynumberImpl implements Mynumber {

	@Override
	public int max(int x, int y) {

		int max = 0;
//		if (x >= y) {
//			max = x;
//		} else if (y > x) {
//			max = y;
//		}
//		return max;

		max = x > y ? x : y; // 삼항연산자
		return max;
	}

}
