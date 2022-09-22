package DesignPattern.Project;

import DesignPattern.Project.Interfaces.DisplacementStrategy;

public class CarDisplacement implements DisplacementStrategy {

    @Override
    public double displacement(double distance){
        double speed = 90.0;
        return (distance/speed);
    }
}
