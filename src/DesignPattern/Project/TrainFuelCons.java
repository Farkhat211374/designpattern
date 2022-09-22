package DesignPattern.Project;

import DesignPattern.Project.Interfaces.FuelConsumptionStrategy;

public class TrainFuelCons implements FuelConsumptionStrategy {
    @Override
    public double useFuel(double distance){
        double expenditure = 1.6; //на каждый метр, (100km -160kg)
        return expenditure*distance;
    }
}
