package stream;

import java.util.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex02 {

	public static void main(String[] args) {

		// 리스트 생성
		List<Integer> list = Arrays.asList(5, 1, 2, 4, 3, 3);

		// 스트림 생성
		Stream<Integer> stream = list.stream();

		// 리스트 안에 값을 하나씩 출력
//		stream.forEach(n -> System.out.print(n + " "));

//		long count = stream.count();

		Stream<Integer> stream2 = list.stream();
		List<Integer> sortedList = stream2.sorted().collect(Collectors.toList());

		System.out.println(list);
		System.out.println(sortedList);

		Stream<Integer> stream3 = list.stream();

		stream3
			.filter(n -> n >= 3) // 중간연산자
			.sorted() //  중간연산자
			.forEach(n -> System.out.print(n)); // 최종연산
		
		//스트림 생성
		Stream<Integer> stream4 = list.stream();
		//스트림 반환
		Stream<Integer> stream5 = stream2.filter(n -> n>=3);
		//스트림 반환
		Stream<Integer> stream6 = stream5.sorted();
			
	}

}
