package interfaces;

import java.time.LocalDate;

public class Appointment implements Comparable<Appointment> {

	private int id;
	private String name;
	private LocalDate appointmentDate = LocalDate.now();
	
	private int priority;
	private boolean completed;
	
	
	@Override
	public int compareTo(Appointment o) {
		return name.compareTo(o.name);
	}

	public Appointment(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Appointment [id=" + id + ", name=" + name + "]";
	}
	
	

}
