package generics;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ModifiedPair<Integer, String> pair = new ModifiedPair<>(10, "Test String");
		//ModifiedPair<LocalDate, List<String>> pair2 = new ModifiedPair<>(LocalDate.now(), Arrays.asList("a","b"));
		
		Pair<Integer> pair = new Pair<>(1,2);
		
		//pair = pair.swap();
		//OR
		Pair.<Integer>swap(pair); 
		
		System.out.println(pair);
	}

}
