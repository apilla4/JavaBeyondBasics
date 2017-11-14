package interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Appointment app1 = new Appointment("Saturn");
		Appointment app2 = new Appointment("Jupiter");
		Appointment app3 = new Appointment("Mars");
		Appointment app4 = new Appointment("Venus");
		
		List<Appointment> list = new ArrayList<>(); //List adds in insertion order
		list.add(app1);
		list.add(app2);
		list.add(app3);
		list.add(app4);
		
		Collections.sort(list); 
		
		list.forEach(System.out::println);
		
		
	}

}
