package interfaces.defaults;

public interface TeamMember {

	String getFirst();
	String getLast();
	
	default String getName() {
		return String.format("%s", getFirst());
	}
}
