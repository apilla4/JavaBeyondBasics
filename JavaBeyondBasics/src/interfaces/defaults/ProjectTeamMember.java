package interfaces.defaults;

public class ProjectTeamMember implements Project, TeamMember {

	private String firstName;
	private String lastName;
	
	@Override
	public String getFirst() {
		return firstName;
	}

	@Override
	public String getLast() {
		return lastName;
	}
	
	@Override
	public
	String getName() {
		return TeamMember.super.getName() + " working on " + Project.super.getName();
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	

}
