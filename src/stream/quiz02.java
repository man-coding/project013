package stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class quiz02 {

	public static void main(String[] args) {
		//파일 목록 생성
		String[] arr = {"file.txt", "file2.pdf", "file3.txt", "file4.img", "file5.txt", "file6.img"};
		
		//1. 파일 목록 중에서 txt 파일만 찾으세요
		Stream<String> stream1 = Arrays.stream(arr);
			stream1
				.filter(n -> n.contains("txt")) //return 이 숨어 있기 때문에 조건을 써줘야 함(true 혹은 false 값을 반환함)
				//true인 것은 n(스트림 요소에 들어감) false 값이 나온 것은 제거됨.
				.forEach(s -> System.out.print(s+ " "));
			
			System.out.println();
			System.out.println();
		//2. 확장자별로 파일의 개수를 구하세요
		Stream<String> stream2 = Arrays.stream(arr);
		int count1 = (int) stream2
						.filter(n -> n.contains("txt"))
						.count();
		System.out.print(count1+" ");
		
		Stream<String> stream3 = Arrays.stream(arr);
		int count2 = (int) stream3
				.filter(n -> n.contains("pdf"))
				.count();
		System.out.print(count2+" ");
		
		Stream<String> stream4 = Arrays.stream(arr);
		int count3 = (int) stream4
				.filter(n -> n.contains("img"))
				.count();
		System.out.println(count3);
		
		System.out.println();	
		//3. 파일의 확장자만 추출하여 출력하세요 (hint! (.) 점은 문자기호로 (\\.)으로 표현한다.
		Stream<String> stream5 = Arrays.stream(arr);
			stream5
				.map(n-> n.replaceAll("file", ""))   //indexOf,split 으로도 가능
				.map(m-> m.replaceAll("[0-6]", "")) 
				.map(o-> o.replaceAll("\\.", ""))
				.distinct()
				.forEach(s -> System.out.print(s+" "));
		
		System.out.println();
		//3-2. split 으로 풀기
		Stream<String> stream6 = Arrays.stream(arr);
			stream6
					.map(s -> {
						String[] strArr = s.split("\\."); //배열 변수에 스플릿한 걸 대입
						return strArr[1]; //그 배열에서 1 인덱스 값만 s에 넣는다.
					})
					.distinct() // 중복 제거
					.forEach(s -> System.out.print(s+" ")); //모두 출력
		//중요!!!!! filter는 조건을 주어 요소를 추리는 것//
			//map은 모든 값을 변환하거나 자료형을 변환할 때 쓰는 것!!
	}

}
