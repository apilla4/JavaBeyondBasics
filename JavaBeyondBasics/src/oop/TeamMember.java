package oop;

import java.time.LocalDate;

public abstract class TeamMember {

	public static final String DEFAULT_NAME = "Default Team";
	private static int nextId;
	
	//private Integer id;
	private String name;
	//private LocalDate joinDate;
	
	
	//always define default constructor
	public TeamMember() {
		this(DEFAULT_NAME);
	}
	
	public TeamMember(String name) {
		//id = nextId++;
		this.name = name;
		//joinDate = LocalDate.now();
	}

	public abstract double getPay(); //for diff implementations getPay varies
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	@Override
	public String toString() {
		return "TeamMember [name=" + name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof TeamMember))
			return false;
		TeamMember other = (TeamMember) obj;
		
		
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
	
	
	
}
