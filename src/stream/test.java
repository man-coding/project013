package stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;


//코테: 요소의 두 곱의 최댓값을 리턴하라.
public class test {

	public static void main(String[] args) {

		//리스트로 풀기
		List<Integer> list = Arrays.asList(1, 1, 2, 3, 5, 4);

		Stream<Integer> stream = list.stream();
		int max = stream.sorted(Comparator.reverseOrder()).limit(2).reduce(1, (a, b) -> a * b);

		System.out.println(max);

		//인트스트림으로 풀기
		
		int[] arr = { 1, 2, 3, 4, 5 };

		IntStream stream2 = Arrays.stream(arr);
		int max2 = stream2.boxed().sorted(Comparator.reverseOrder()).limit(2).reduce(1, (a, b) -> a * b);

		System.out.println(max2);

		
	}

}
