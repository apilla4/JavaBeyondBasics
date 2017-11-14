package generics.drivable;

public interface Drivable {

	default void drive() {
		System.out.println("driving " + this.getClass().getName());
	}
}
