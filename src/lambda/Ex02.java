package lambda;

public class Ex02 {

	public static void main(String[] args) {

		// 컴파일러는 람다식을 익명클래스로 변환하고, 클래스의 인스턴스를 생성한다.
		Calc calc = new Calc() {

			@Override
			public int add(int num1, int num2) {
				return num1 + num2;
			}

		};
		System.out.println(calc.add(3, 5));

	}

}

//함수형 인터페이스 선언
@FunctionalInterface
interface Calc {

	int add(int num1, int num2);
}