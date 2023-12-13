package lambda;

public class quiz02 {

	public static void main(String[] args) {
		// 익명클래스 사용
		Hello hello1 = new Hello() {
			@Override
			public void helloPrint() {
				System.out.println("안녕하세요");
			}
		};
		hello1.helloPrint();

		// 람다식 함수 사용
		Hello hello2 = () -> System.out.println("안녕하세요");
		hello2.helloPrint();

		// 구현클래스
		Hello hello3 = new HelloImpl();
		hello1.helloPrint();
	}
}

//함수형 인터페이스 선언
interface Hello {

	void helloPrint(); // 람다식 함수를 사용하기 위해 1개만 있어야 함
	// 추상메소드 선언

}

class HelloImpl implements Hello {

	@Override
	public void helloPrint() {
		System.out.println("안녕하세요");
	}

}
