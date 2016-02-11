package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE

	Robot aerobe = new Robot ();
	aerobe.setPenColor(Color. green);
	aerobe.penDown();
	aerobe.sparkle();
    
   for(int i=0 ; i<4; i++)
   {
	   aerobe.move(50);
	   aerobe.turn(90);
	   
   }
   
			
	

