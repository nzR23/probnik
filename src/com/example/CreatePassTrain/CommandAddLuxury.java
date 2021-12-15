package com.example.CreatePassTrain;

public class CommandAddLuxury implements Command {
    private CreateTrainCars car;

    public CommandAddLuxury(CreateTrainCars car) {
        this.car = car;
    }

    @Override
    public void execute() {
        car.CreateLuxuryTrainCarr();
    }
}
