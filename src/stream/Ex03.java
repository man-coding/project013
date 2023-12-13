package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex03 {

	public static void main(String[] args) {
		
		//리스트 생성
		List<Integer> list = Arrays.asList(1,1,2,3,5,4);
		
		//리스트로부터 스트림 생성 
		//중간연산으로 중복을 제거하고 출력
		Stream<Integer> stream1 = list.stream();
		stream1
			.distinct() //중복제거
			.forEach(n -> System.out.print(n+" ")); //인자로 람다식을 받음
		
		System.out.println();
		
		//중간연산으로 2의 배수 추출하고 최종연산으로 하나씩 출력
		Stream<Integer> stream2 = list.stream();
		stream2
			.filter(n -> n % 2 == 0) //걸러내는 기능   인자로 람다식을 받음
			.forEach(n -> System.out.print(n + " ")); //인자로 람다식
		
		System.out.println();
		
		//중간연산으로 요소를 3개만 출력
		Stream<Integer> stream3 = list.stream();
		stream3
			.limit(3)
			.forEach(n -> System.out.print(n + " "));
		
		System.out.println();
		
		//중간연산으로 순서대로 정렬하고 출력
		Stream<Integer> stream4 = list.stream();
		stream4
		.sorted()
		.forEach(n -> System.out.print(n + " "));
		
		System.out.println();
		
		//역순 정렬
		Stream<Integer> stream5 = list.stream();
		stream5
		.sorted(Comparator.reverseOrder())
		.forEach(n -> System.out.print(n + " "));
		

		System.out.println();
		
		//기본형 스트림 IntStream 으로 변경 후 합계 출력
		Stream<Integer> stream6 = list.stream();
		IntStream intStream = stream6.mapToInt(n -> n.intValue());
		System.out.println(intStream.sum());
		
		System.out.println();
		
		
		List<String> strList = Arrays.asList("aaa","bbb","ccc");
		//중간연산으로 요소를 대문자로 변경하고 출력
		Stream<String> stream7 = strList.stream();
		stream7
		.map(s -> s.toUpperCase())
		.forEach(n -> System.out.print(n + " "));
		
		System.out.println();
		//중간연산으로 문자열의 길이로 변경하고 출력
		Stream<String> stream8 = strList.stream();
		stream8
		.map(s -> {
			int length = s.length();
			return length;
		})//코드가 두 줄 이상일 때 블록과 리턴 키워드 필요   -> 어퍼케이스처럼 한 줄일 때는 생략 가능
		.forEach(s -> System.out.print(s + " "));
	}

}
