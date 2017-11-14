package oop;

public class Developer extends TeamMember {

	private static double DEFAULT_SALARY = 8000;
	private double salary = DEFAULT_SALARY;
	
	public Developer(String name, Double salary) {
		super(name);
		this.salary = salary;
	}
	
	@Override
	public double getPay() {
		return salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof Developer))
			return false;
		Developer other = (Developer) obj;
		if (Double.doubleToLongBits(salary) != Double
				.doubleToLongBits(other.salary))
			return false;
		return true;
	}

	
	
	
	
	

}
