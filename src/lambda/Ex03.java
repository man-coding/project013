package lambda;

public class Ex03 {

	public static void main(String[] args) {

		// 구현 클래스 사용하기 (객체지향 방식)
		StringConcat concat1 = new StringConcatImpl();
		concat1.makeString("Hello", "World");

		// 함수형 방식
		StringConcat concat2 = (str1, str2) -> System.out.println(str1 + "," + str2);
		concat2.makeString("Hello", "World");
	}

}

interface StringConcat {

	// 두 문자열을 연결하는 메소드 선언
	public void makeString(String s1, String s2); // 추상메소드
}

class StringConcatImpl implements StringConcat { // impl <= 부모이름에 붙여주는 구현체

	@Override
	public void makeString(String s1, String s2) {
		System.out.println(s1 + "," + s2);
	}

}