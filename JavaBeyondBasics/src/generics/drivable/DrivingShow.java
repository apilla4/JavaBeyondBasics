package generics.drivable;

import java.util.Arrays;
import java.util.List;

public class DrivingShow {
	
	//wildcard in signature
	public static <T extends Drivable> void driveAll(List<T> items) {
		for(T vehicle: items) {
			vehicle.drive();
		}
	}
	
	public static void main(String[] args) {
		DrivingShow.driveAll(Arrays.asList(new Car(), new MotorCycle()));
	}
}
