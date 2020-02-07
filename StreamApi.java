package TestStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo1 {
	
	public static void main(String[] args) {
		
		Stream.of(new Integer[] {1,2,3,4,5}).forEach(System.out::println);
		
		
		List<Integer> myList = new ArrayList<>();
		for(int i=0;i<=20;i+=2) {
			myList.add(i);
		}
		
		myList.stream().forEach(p->System.out.print(p+" "));
		System.out.println();
		
		
		Integer a[] = {1,2,3,4,5,6,6,4,2,0};
		List<Integer> myList1 = Arrays.asList(a);
		Set<Integer> mySet = myList1.stream().collect(Collectors.toSet());
		System.out.println(mySet);
		
		Stream<Integer> itr = Stream.iterate(45,p->p*7).limit(5);
		itr.filter(i->i%5==0).forEach(System.out::println);
		
		
		
		
		
	}
	
	
	
	
	
	
	

}
