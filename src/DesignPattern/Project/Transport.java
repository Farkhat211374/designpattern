package DesignPattern.Project;

import DesignPattern.Project.Interfaces.DisplacementStrategy;
import DesignPattern.Project.Interfaces.FuelConsumptionStrategy;

public class Transport{

   private FuelConsumptionStrategy fuelConsumptionStrategy;
   private DisplacementStrategy displacementStrategy;

    public Transport(){
        fuelConsumptionStrategy = new CarFuelCons(); //default
        displacementStrategy = new CarDisplacement(); //default
    }

    public double usageFuel(double distance){
        return fuelConsumptionStrategy.useFuel(distance);
    }

    public double displacement(double distance){
        return displacementStrategy.displacement(distance);
    }

    //choosing transport

    public void setCar(){
        fuelConsumptionStrategy = new CarFuelCons();
        displacementStrategy = new CarDisplacement();
    }

    public void setPlane(){
        fuelConsumptionStrategy = new PlaneFuelCons();
        displacementStrategy = new PlaneDisplacement();
    }

    public void setTrain(){
        fuelConsumptionStrategy = new TrainFuelCons();
        displacementStrategy = new TrainDisplacement();
    }

    public void setBoat(){
        fuelConsumptionStrategy = new BoatFuelCons();
        displacementStrategy = new BoatDisplacement();
    }

}
