/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team87.robot;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.interfaces.Gyro;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	//// CREATING BUTTONS
	// One type of button is a joystick button which is any button on a
	//// joystick.
	// You create one by telling it which joystick it's on and which button
	// number it is.
	// Joystick stick = new Joystick(port);
	// Button button = new JoystickButton(stick, buttonNumber);

	//Pinch -sparks
	//Drive -talon
	//Linear -victor/encoder spark/limit switch
	
	static Joystick joystick;
	static Joystick gamepad;
	
	static Talon leftFrontMotor;
	static Talon leftRearMotor;
	static Talon rightFrontMotor;
	static Talon rightRearMotor;
	
	static VictorSP leftLinearMotor;
	static VictorSP rightLinearMotor;
	
	static Spark leftPinch;
	static Spark rightPinch;
	
	// Miscellaneous
	static Timer timer;
	static Gyro gyro;
	static Servo servo;
	
	static PWM pwm;
	
	public OI() {
		joystick = new Joystick(RobotMap.joystick);
		gamepad = new Joystick(RobotMap.gamepad);
		// Drive Motors
		leftFrontMotor = new Talon(RobotMap.LEFTFRONTMOTOR);
		leftRearMotor = new Talon(RobotMap.LEFTREARMOTOR);
		rightFrontMotor = new Talon(RobotMap.RIGHTFRONTMOTOR);
		rightRearMotor = new Talon(RobotMap.RIGHTREARMOTOR);
		// Linear Motors
		leftLinearMotor = new VictorSP(RobotMap.LEFTLINEARMOTOR);
		rightLinearMotor = new VictorSP(RobotMap.RIGHTLINEARMOTOR);
		// Pinch Motors
		leftPinch = new Spark(RobotMap.LEFTPINCH);
		rightPinch = new Spark(RobotMap.RIGHTPINCH);
		
		servo = new Servo(RobotMap.SERVO);
	}
	

	
	public void drive(double leftValue, double rightValue) {
		leftFrontMotor.set(leftValue);
		leftRearMotor.set(leftValue);
		rightFrontMotor.set(rightValue);
		rightRearMotor.set(rightValue);
	}
	
	public void motorStop() {
		leftFrontMotor.stopMotor();
		leftRearMotor.stopMotor();
		rightFrontMotor.stopMotor();
		rightRearMotor.stopMotor();
	}
	
	public void ledEffort() {
		
	}
	
	
}
