package interfaces.defaults;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {

	public static void main(String[] args) {
		/*
		 * ProjectTeamMember member = new ProjectTeamMember();
		 * member.setFirstName("Jolly"); System.out.println(member.getName());
		 */

		List<Integer> nums = Stream.of(5, 19, -12, -1, 11, -5, 10, 34).collect(
				Collectors.toList());
		
		boolean removedOrNot = nums.removeIf(n -> n<=0); //Predicate. removeIf is the utility static method added in List
		System.out.println(removedOrNot);
		System.out.println(nums);

	}

}
