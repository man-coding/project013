package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex05 {

	public static void main(String[] args) {
		
		List<Customer> customerList = new ArrayList<>();
		
		Customer customer1 = new Customer("둘리", 40, 100);
		Customer customer2 = new Customer("또치", 13, 50);
		Customer customer3 = new Customer("도우너", 25, 70);
		
		customerList.add(customer1);
		customerList.add(customer2);
		customerList.add(customer3);
		System.out.println(customerList);
		
		System.out.println();
		
		//고객의 명단
		Stream<Customer> stream1 = customerList.stream();
		stream1
			.map(c -> c.name) //이름만 뽑아 출력
			.forEach(s -> System.out.println(s));
		
		System.out.println();
		
		//모든 고객의 총 예산
		Stream<Customer> stream2 = customerList.stream();
		int sum = stream2.mapToInt(c->c.budget).sum(); //예산을 인트 자료형으로 바꿔준 다음 sum을 써야 한다.
		System.out.println(sum);
		
		System.out.println();
		
		//20세 이상 고객 명단 
		Stream<Customer> stream3 = customerList.stream();
		stream3
			.filter(c -> c.age >= 20)    //20살 이상으로 거르고
			.map(c -> c.name)	//이름을 뽑는다
			.sorted()	// 가나다순 정렬
			.forEach(s -> System.out.println(s)); //출력
	}

}

//고객 클래스
class Customer{
	String name;
	int age;
	int budget;
	
	public Customer(String name, int age, int budget) {
		super();
		this.name = name;
		this.age = age;
		this.budget = budget;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + ", budget=" + budget + "]";
	}
	
	
}