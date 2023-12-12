package innerclass;

public class Ex05 {

	public static void main(String[] args) {

	}

}

class Outer {
	private int a = 10; // 접근제어자를 private로 지정
	private static int b = 20;

	class InClass {
		int i1 = a; // 외부클래스의 private 멤버도 사용 가능
		int i2 = b;
	}

	static class InStaticClass {
		int i2 = b;
	}
}