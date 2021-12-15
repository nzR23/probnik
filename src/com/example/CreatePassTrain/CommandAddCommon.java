package com.example.CreatePassTrain;

public class CommandAddCommon implements Command {
    private CreateTrainCars car;

    public CommandAddCommon(CreateTrainCars car) {
        this.car = car;
    }

    @Override
    public void execute() {
        car.CreateCommonTrainCarr();
    }

}
