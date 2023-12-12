package innerclass;

public class Ex01 {

	public static void main(String[] args) {

	}

}

//클래스 만들고 사용하기
//class A {
//	int num = 10;
//
//}

class B {
	void method() {
		A a = new A();
		System.out.println(a.num); //
	}

}