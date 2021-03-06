package org.usfirst.frc.team4501.robot;

import edu.wpi.first.wpilibj.SampleRobot;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Timer;

/**
 * This sample program shows how to control a motor using a joystick. In the
 * operator control part of the program, the joystick is read and the value is
 * written to the motor.
 *
 * Joystick analog values range from -1 to 1 and speed controller inputs also
 * range from -1 to 1 making it easy to work together. The program also delays a
 * short time in the loop to allow other threads to run. This is generally a
 * good idea, especially since the joystick values are only transmitted from the
 * Driver Station once every 20ms.
 */
public class Robot extends SampleRobot {

	private SpeedController motor1 = new Talon(0);
	private SpeedController motor2 = new Talon(1);
	private SpeedController motor3 = new Talon(2);
	private SpeedController motor4 = new Talon(3);
	private SpeedController motor5 = new Talon(4);
	private SpeedController motor6 = new Talon(5);
	private SpeedController motor7 = new Talon(6);
	private SpeedController motor8 = new Talon(7);// initialize the motor as a
	private SpeedController motor9 = new Talon(8);
	private SpeedController motor10 = new Talon(9);

	XboxController stick = new XboxController(1);
	// Talon on channel 0
	// private Joystick stick = new Joystick(2); // initialize the joystick on port
	// 0

	private final double kUpdatePeriod = 0.005; // update every 0.005 seconds/5
												// milliseconds (200Hz)

	public Robot() {
	}

	/**
	 * Runs the motor from a joystick.
	 */
	@Override
	public void operatorControl() {
		while (isOperatorControl() && isEnabled()) {

			// Set the motor's output.
			// This takes a number from -1 (100% speed in reverse) to +1 (100%
			// speed going forward)
			// motor1.set(stick.getY());
			// motor2.set(stick.getY());
			// motor3.set(stick.getY());
			// motor4.set(stick.getY());
			// motor5.set(stick.getY());
			// motor6.set(stick.getY());
			// motor7.set(stick.getY());
			// motor8.set(stick.getY());
			// motor9.set(stick.getY());
			// motor10.set(stick.getY());

			motor1.set(getLeftXboxY());
			motor2.set(getLeftXboxY());
			motor3.set(getLeftXboxY());
			motor4.set(getLeftXboxY());
			motor5.set(getLeftXboxY());
			motor6.set(getLeftXboxY());
			motor7.set(getLeftXboxY());
			motor8.set(getLeftXboxY());
			motor9.set(getLeftXboxY());
			motor10.set(getLeftXboxY());

			Timer.delay(kUpdatePeriod); // wait 5ms to the next update
		}

	}

	public double getLeftXboxY() {
		return stick.getRawAxis(1);
	}

}
