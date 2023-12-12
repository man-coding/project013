//package innerclass;
//
////내부클래스 종류와 제약사항 (1)
//public class Ex03 {
//
//	public static void main(String[] args) {
//
//		// 인스턴스 내부 클래스의 인스턴스 생성
//		Outer outer = new Outer();
//		Outer.InstanceInner instanceInner = outer.new InstanceInner();
//		instanceInner.i1 = 300; // 인스턴스 변수 사용
//		instanceInner.i2 = 300; // 정적 변수 사용
//
//		Outer outer2 = new Outer();
//		Outer.InstanceInner instanceInner2 = outer2.new InstanceInner();
//		instanceInner2.i1 = 400; // 인스턴스 변수 사용
//		instanceInner2.i2 = 400; // 정적 변수 사용
//
//		System.out.println(instanceInner.i1 + ", " + instanceInner.i2);
//		System.out.println(instanceInner2.i1 + ", " + instanceInner2.i2);
//		
//		//정적 내부 클래스의 인스턴스 생성
//		Outer.StaticInner staticInner = new Outer.StaticInner();
//		staticInner.i1 = 300;
//		staticInner.i2 = 300;
//	}
//
//}
//
////class Outer {
////
////	// 인스턴스 클래스는 인스턴스변수와 정적변수를 모두 가질 수 있다.
////	class InstanceInner {
////		int i1 = 100;
////		// 단, 외부 객체 없이는 사용할 수 없기 때문에 정적변수는 외부 객체에 종속된다.
////		static int i2 = 200;
////
////	}
////
////	// 정적 클래스는 인스턴스변수와 정적변수를 모두 가질 수 있음.
////	static class StaticInner {
////		int i1 = 100;
////		static int i2 = 200;
////
////	}
////}
