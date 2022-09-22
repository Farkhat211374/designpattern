package DesignPattern.Project;

import DesignPattern.Project.Interfaces.FuelConsumptionStrategy;

public class BoatFuelCons implements FuelConsumptionStrategy {
    @Override
    public double useFuel(double distance){
        double expenditure = 5.0; // на каждый метр (вымышленное ззначение)
        return expenditure*distance;
    }
}
