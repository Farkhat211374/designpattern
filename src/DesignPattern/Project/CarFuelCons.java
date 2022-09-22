package DesignPattern.Project;

import DesignPattern.Project.Interfaces.FuelConsumptionStrategy;

public class CarFuelCons implements FuelConsumptionStrategy {
    @Override
    public double useFuel(double distance) {
        double expenditure = 0.1; //на каждый метр, (100km - 10)
        return expenditure*distance;
    }
}
