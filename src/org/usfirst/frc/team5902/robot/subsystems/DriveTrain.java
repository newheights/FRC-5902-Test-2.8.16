package org.usfirst.frc.team5902.robot.subsystems;

import org.usfirst.frc.team5902.robot.Robot;
import org.usfirst.frc.team5902.robot.commands.ArcadeDriveWithDriverXbox;

import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Joystick.AxisType;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class DriveTrain extends Subsystem {
    private RobotDrive drive;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public DriveTrain() {
		super();
		drive = new RobotDrive(0,1);
		// Let's show everything on the LiveWindow
	}
    /**
	 * When no other command is running let the operator drive around
	 * using the Driver Xbox left joystick.
	 */
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new ArcadeDriveWithDriverXbox());
    }
    /**
	 * The log method puts interesting information to the SmartDashboard.
	 */
	public void log() {
		// TODO Auto-generated method stub
		// EXAMPLE 		SmartDashboard.putNumber("Left Distance", left_encoder.getDistance());
		
	}
	public void drive(Joystick DriverXbox) {
		drive(DriverXbox.getY(), -DriverXbox.getX())
	}
}

