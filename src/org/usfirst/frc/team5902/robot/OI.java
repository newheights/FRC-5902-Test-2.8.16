package org.usfirst.frc.team5902.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc.team5902.robot.commands.ExampleCommand;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
	
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
	Joystick DriverXbox = new Joystick(0);
	Button buttonA = new JoystickButton(DriverXbox, 1);
	
	//Joystick OperatorJoystick = new Joystick(1);
	//What are button numbers actually.  Use port mapping to find out and replace 1 and 2 in lines below
	Button joystickForward = new JoystickButton(OperatorJoystick, 1);
	Button joystickBackwards = new JoystickButton(OperatorJoystick, 2);

	
    //// TRIGGERING COMMANDS WITH BUTTONS
	// joystickBackwards.whenPressed(new intakeBall());
	buttonA.whenPressed(new intakeBall());
	// Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    // Wayne Example buttonA.whenPressed(new ExampleCommand())
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());

public Joystick getJoystick() {
    return DriverXbox;
}
}

