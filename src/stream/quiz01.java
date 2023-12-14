package stream;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class quiz01 {

	public static void main(String[] args) {
		
		String[] arr = {"aaa","aaa","b","b","cccc"};
		
		//1. 길이가 2보다 큰 요소의 개수 출력
		Stream<String> stream1 = Arrays.stream(arr);
		long count = stream1   //변수에 넣어줘야 출력 가능
			.filter(s -> s.length() > 2)
			.count();
		System.out.println(count);
		
		System.out.println();
		
		//2. 모든 문자열의 길이를 더한 합을 구하세요
		Stream<String> stream2 = Arrays.stream(arr);
			int sum = stream2
						.mapToInt(s -> s.length()) //자료형을 바꿈과 동시에 길이값으로 변경. -> map 말고 mapToInt 쓴다
						.sum();   //합을 구한다.
			System.out.println(sum);
			
		System.out.println();
			
		//3. 가장 길이가 짧은 요소의 값을 출력
		Stream<String> stream3 = Arrays.stream(arr);
		stream3
			.map(s -> s.length())   //문자열의 길이로 변경
			.sorted() //순정렬
			.limit(1) //가장 앞에 있는 숫자를 가져오겠다.
			.forEach(s -> System.out.println(s + " ")); //출력
		
		System.out.println();
		
		//3-2. 다른 방법 OptionalInt
		Stream<String> stream4 = Arrays.stream(arr);
		OptionalInt min = stream4
							.mapToInt(s -> s.length())
							.min();
		System.out.println(min.getAsInt());
		
		System.out.println();
		
		//4. 중복을 제거한 리스트를 만드세요.
		Stream<String> stream5 = Arrays.stream(arr);
		
		List<String> list = stream5
								.distinct()
								.collect(Collectors.toList());
		System.out.println(list);
		
			
	}

}
