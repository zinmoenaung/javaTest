
package javaTest;

import java.util.Scanner;
public class MagicCompass{
String direction;
int distance;
String locationStatus;

public MagicCompass(String direction, int distance) {
	super();
	this.direction = direction;
	this.distance = distance;
	
}
public void CompassSpeak() {
	Scanner s = new Scanner(System.in);
	System.out.println("Go North "+ distance);
	
	
	
	
	
	System.out.println("Go South "+ distance);
	System.out.println("Go West "+ distance);
	System.out.println("Go East "+ distance);
	System.out.println("You Reach Your Destination");
}
}
