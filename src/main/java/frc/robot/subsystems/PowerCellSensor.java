/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class PowerCellSensor extends SubsystemBase {
  private DigitalInput sensor1;
  private DigitalInput sensor2;
  /**
   * Creates a new PowerCellSensor.
   */
  public PowerCellSensor() {
    sensor1 = new DigitalInput(0);
    sensor2 = new DigitalInput(9);
    
    

    
  }

  @Override
  public void periodic() {
    if(!sensor1.get())
      SmartDashboard.putBoolean("Sensor 1: ", true);
    else
      SmartDashboard.putBoolean("Sensor 1: ", false);

    if(!sensor2.get())
      SmartDashboard.putBoolean("Sensor 2: ", true);
    else
      SmartDashboard.putBoolean("Sensor 2: ", false);
    // This method will be called once per scheduler run
  }
}
