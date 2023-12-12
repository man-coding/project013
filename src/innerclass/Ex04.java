package innerclass;

public class Ex04 {

	public static void main(String[] args) {

	}

}

//내부클래스 종류와 제약사항(2)
//class Outer {
//	void method() {
//		int i = 100;
//
//		class LocalInner {
//
//			void innerMethod() {
//				// i = 200;
//				// 따라서 메소드의 지역변수보다 객체의 생애주기가 더 길기 때문에,
//				// 지역변수는 값을 변경할 수 없도록 상수가 된다.
//			}
//		}
//	}
//}