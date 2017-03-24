package tests;

import static org.junit.Assert.*;
import org.junit.Test;

import drone.Drone;

public class DroneBasicTest {
	
	private int[] boundaries = {50,50,50,};
	private int[] startCoordinates = {30,0,30};
	
	Drone drone;
	
	@Test 
	public void testInitialMoveUP(){
		drone = new Drone(startCoordinates[0], startCoordinates[1],startCoordinates[2]);
		
		String expectedCoordinates = "Pozicija ("+Integer.toString(startCoordinates[0]) + "," + Integer.toString(startCoordinates[1] +1) + "," + Integer.toString(startCoordinates[2]) + ")"; 
		
		assertEquals(expectedCoordinates, drone.moveUp());
	}
				
}