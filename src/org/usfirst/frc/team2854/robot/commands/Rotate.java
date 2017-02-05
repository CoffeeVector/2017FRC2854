package org.usfirst.frc.team2854.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team2854.robot.subsystems.*;
import org.usfirst.frc.team2854.robot.Robot;
import org.usfirst.frc.team2854.robot.commands.*;


public class Rotate extends Command{
	private boolean isFinished = false;
	private float targetTheta;
	private float velocity;
	
	public Rotate(float targetTheta, float omega, int port){
		requires(Robot.driveTrain);
		this.targetTheta = targetTheta;
		velocity = omega * DriveTrain.width;
	}
	
	@Override
	protected void execute(){
		isFinished = true;
	}
	
	@Override 
	protected boolean isFinished(){
		return isFinished;
	}

	@Override
	protected void end(){
		
	}
	

}
