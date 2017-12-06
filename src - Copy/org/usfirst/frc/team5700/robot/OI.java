package org.usfirst.frc.team5700.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc.team5700.robot.commands.FullSpeed;

public class OI {
	
	private Joystick stick = new Joystick(0);
	
	JoystickButton button = new JoystickButton(stick, 1);
	
	public Joystick getStick()
	{
		return stick;
	}
	
	public OI()
	{
		button.whileHeld(new FullSpeed());
	}
	
}
