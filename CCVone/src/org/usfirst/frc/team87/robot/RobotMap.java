/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team87.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	
	//////////////
	////MOTORS////
	//////////////
	public static int LEFTFRONTMOTOR = 0;
	public static int LEFTREARMOTOR = 1;
	public static int RIGHTFRONTMOTOR = 2;
	public static int RIGHTREARMOTOR = 3;
	
	public static int LEFTLINEARMOTOR = 4;
	public static int RIGHTLINEARMOTOR = 5;
	
	public static int LEFTPINCH = 6;
	public static int RIGHTPINCH = 7;
	
	///////////////////
	////Positioning////
	///////////////////
	public static String side[] = {"Red", "Blue"};
	public static String position[] = {"Left", "Middle", "Side"};
	
	///////////////////
	////Controllers////
	///////////////////
	public static int gamepad = 0;
	public static int joystick = 1;
	
	///////////
	////POV////
	///////////
	public static int UP = 0;
	public static int RIGHT = 90;
	public static int DOWN = 180;
	public static int LEFT = 270;
	
	///////////
	////LED////
	///////////
	public static int LEDONE = 0;
	public static int LEDTWO = 1;
	
	/////////////
	////Servo////
	/////////////
	public static int SERVO = 20;
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
	
	/*
	 * 
	 * Pinch -sparks
	 * Drive -talon
	 * linear -victor/encoder spark/limit switch
	 * 
	 * 
	 */
}
  