package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class quiz03 {

	public static void main(String[] args) {
		
		//거래내역 리스트 생성
		List<Order> list = new ArrayList<>();
		
		list.add(new Order(1001,2022,300));
		list.add(new Order(1002,2022,150));
		list.add(new Order(1003,2022,200));
		list.add(new Order(1004,2023,500));
		list.add(new Order(1005,2023,400));
		list.add(new Order(1006,2023,600));
		list.add(new Order(1007,2023,650));
		
		//1. 모든 거래번호를 한줄에 나열하세요.
		Stream<Order> stream1 = list.stream();
			stream1
				.forEach(n -> System.out.print(n.orderNo + " "));
		
		System.out.println();
		//2. 2022년도의 거래 총금액과 건수를 출력하세요
		//22년 총금액
		Stream<Order> stream2 = list.stream(); 
			int sum22 = stream2
						.filter(n -> n.year == 2022)
						.mapToInt(s -> s.price)
						.sum();
			System.out.print(sum22 + " ");	
			
		//22년 건수
		Stream<Order> stream3 = list.stream();
			long count22 = stream3
						 .filter(n -> n.year == 2022)
						 .count();
			System.out.println(count22);
		
		//3. 2023년도의 거래 총금액과 건수를 출력하세요
		//23년 총금액
		Stream<Order> stream4 = list.stream();
			int sum23 = stream4
						.filter(n -> n.year == 2023)
						.mapToInt(s -> s.price)
						.sum();
			System.out.print(sum23 + " ");
		//23년 건수	
		Stream<Order> stream5 = list.stream();
			long count23 = stream5
						 .filter(n -> n.year == 2023)
						 .count();
			System.out.println(count23);
			//***헷갈리면 디버깅으로 값에 뭐가 들어있는지 확인하기.
			//인자로 뭘 받는지도 확인하기.
			
}
}

class Order {

	int orderNo; //주문번호
	int year; //주문연도
	int price; //거래금액(만원)

	public Order(int orderNo, int year, int price) {
		super();
		this.orderNo = orderNo;
		this.year = year;
		this.price = price;
	}

}