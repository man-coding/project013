package innerclass;

public class Ex02 {

	public static void main(String[] args) {

	}

}

//B클래스를 A클래스의 내부 클래스로 정의하기.
class A { // 외부 클래스
	int num = 10;

	class B { // 내부 클래스

		void method() {
			System.out.println(num); // 객체 생성없이 멤버를 그냥 사용할 수 있음
		}
	}
}