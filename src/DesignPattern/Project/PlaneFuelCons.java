package DesignPattern.Project;

import DesignPattern.Project.Interfaces.FuelConsumptionStrategy;

public class PlaneFuelCons implements FuelConsumptionStrategy {
    @Override
    public double useFuel(double distance){
        double expenditure = 0.0473; //на каждый метр, (100km - 4,73) for one passenger
        return expenditure*distance;
    }
}
