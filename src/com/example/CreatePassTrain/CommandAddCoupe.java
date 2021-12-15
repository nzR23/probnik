package com.example.CreatePassTrain;

public class CommandAddCoupe implements Command {
    private CreateTrainCars car;

    public CommandAddCoupe(CreateTrainCars car) {
        this.car = car;
    }

    @Override
    public void execute() {
        car.CreateCopeTrainCarr();
    }

}
