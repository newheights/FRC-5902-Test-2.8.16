package org.usfirst.frc.team5902.robot.subsystems;

import org.usfirst.frc.team5902.robot.commands.IntakeDoNothing;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 *
 */
public class Intake extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    private SpeedController IntakeMotor;
   
    
    public Intake() {
        super();
        IntakeMotor = new Victor(2);
		Intakedrive = new IntakeDrive(2);

        // Below code is for a limit switch to stop motor
        // contact = new DigitalInput(5);

		// Let's show everything on the LiveWindow
        LiveWindow.addActuator("Intake", "Motor", (Victor) motor);
        // LiveWindow.addActuator("Intake", "Limit Switch", contact);
    }


    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new IntakeDoNothing());
    }
    
    public void intakeFullStop() {
        IntakeMotor.set(0);
    }
    
    public void intakeBall() {
    	IntakeMotor.set(-.5);
    }

    public void ejectBall() {
    	IntakeMotor.set(.5);
    }
    
/* not sure if we need this?
 * public void DriverIntakeBall() {     }
 */
    
	public void log() {
		// TODO Auto-generated method stub
		
	}
}

