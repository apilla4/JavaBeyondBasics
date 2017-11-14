package oop;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;



public class HR {

	private List<TeamMember> teamMemberList = new ArrayList<>();
	
	private static double totalSum;
	
	public void remove(TeamMember teamMember){
		teamMemberList.remove(teamMember);
	}
	
	public void add(TeamMember teamMember) {
		teamMemberList.add(teamMember);
	}
	
	public void listAllMembers() {
		teamMemberList.forEach(System.out::println); //cannot put System.out.println inside instead
	}
	
	
	
	public List<TeamMember> getTeamMemberList() {
		return teamMemberList;
	}

	public static void printTeamMemberNames(List<TeamMember> members) {
		members.stream().map(TeamMember::getName).forEach(System.out::println);
	}
	
	//for Developers also
	public static void printTeamMemberNamesWithSubClasses(List<? extends TeamMember> members) {
		members.stream().map(TeamMember::getName).forEach(System.out::println);
		//members.add(new Developer("Dan", totalSum)) cannot do this
	}
	
	public static void printFiltered(List<? extends TeamMember> members, Predicate<? super TeamMember> predicate) {
		for(TeamMember e: members) {
			if(predicate.test(e)) {
				System.out.println(e.getName());
			}
		}
	}
	
	public static void main(String[] args) {
		HR hr = new HR();
		hr.add(new Developer("Harry", 9000.15));
		hr.add(new Developer("Steve", 9100.25));
		
		
		
		//hr.listAllMembers();
		
		//hr.printAllPays();
		
		HR hr2 = new HR();
		hr2.add(new Developer("Job", 5000.90));
		hr2.add(new Developer("Malcom", 3500.15));
		
		//hr2.printAllPays();
		
		System.out.println(hr.totalSalary());
		System.out.println(hr2.totalSalary()); //12 decimals
		
		TeamMember dev1 = new Developer("Harry", 9000.0);
		TeamMember dev2 = new Developer("Harry", 10000.0);
		
		System.out.println(dev1.equals(dev2));
		
		String a = "a";
		String b = "a";
		
		System.out.println(a == b);
		
		String c = new String("a");
		System.out.println(c == b);
		
		HR.printTeamMemberNames(hr.getTeamMemberList());
		
		List<Developer> mem = new ArrayList<>();
		mem.add(new Developer("Samson", 2000.15));
		
		//HR.printTeamMemberNames(mem); cannot
		
		HR.printTeamMemberNamesWithSubClasses(mem); //can
		
		HR.printTeamMemberNamesWithSubClasses(hr.getTeamMemberList());
		
		System.out.println("Testtststststs");
		
		HR.printFiltered(mem, e -> e.toString().length() % 2 == 0);
		
	}
	
	public double totalSalary() {
		
		NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.GERMANY); //prints currency symbol
		
		for(TeamMember t : teamMemberList) {
			System.out.println(nf.format(t.getPay())); //US dollars
			this.totalSum+=t.getPay();
		}
		
		return this.totalSum;
	}

	
}
