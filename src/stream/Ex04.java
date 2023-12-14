package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex04 {

	public static void main(String[] args) {

		int[] intArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		// 배열에서 기본형 스트림 생성

		// Stream<Integer> -> IntStream
		IntStream stream1 = Arrays.stream(intArr);
		// 지정된 반복 작업을 수행
		stream1.forEach(n -> System.out.print(n));
		System.out.println();

		// 스트림 요소의 개수 구하기
		IntStream stream2 = Arrays.stream(intArr);
		System.out.println(stream2.count());

		// 스트림 요소의 합 구하기
		IntStream stream3 = Arrays.stream(intArr);
		System.out.println(stream3.sum()); // 기본형 스트림에서만 사용 가능
		System.out.println();

		// 초기값을 넣고, 반복 작업 수행
		IntStream stream4 = Arrays.stream(intArr);
		int result = stream4.reduce(10, (total, n) -> total + n); // stream.reduce(n,람다식)
		System.out.println(result);
		
		
		//리스트 생성
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		//스트림을 set으로 변경
		Stream<Integer> stream5 = list.stream();
		Set<Integer> set = stream5.collect(Collectors.toSet()); //인자로 변환하고 싶은 것 넣는다
		System.out.println(set);
		
		//스트림을 list로 변경
		Stream<Integer> stream6 = list.stream();
		List<Integer> strList = stream6.collect(Collectors.toList()); 
		System.out.println(list);
		
		
	}

//	int applyAsInt(int total, int n) {
//		total = total + n;
//		return total;   //스트림의 개수만큼 호출됨.
}
