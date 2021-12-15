package com.example.transports;

public class CoupeTrainCar extends TrainCar{
    private int ComfortLevel;
    private int NumbPassengers;
    private int NumbLuggage;

    public CoupeTrainCar(String name,int ComforLevel,int NumbPassengers,int NumbLuggage  ){
        super(name);
        this.ComfortLevel=ComforLevel;
        this.NumbPassengers=NumbPassengers;
        this.NumbLuggage=NumbLuggage;
    }


    @Override
    public int getComfortLevel() { return ComfortLevel; }

    @Override
    public int getNumbPassengers() { return NumbPassengers; }

    @Override
    public int getNumbLuggage() { return NumbLuggage; }

    @Override
    public void setNumbPassengers(int numbPassengers) {
        NumbPassengers = numbPassengers;
    }
    @Override
    public void setComfortLevel(int comfortLevel) {
        ComfortLevel = comfortLevel;
    }

    @Override
    public void setNumbLuggage(int numbLuggage) {
        NumbLuggage = numbLuggage;
    }

    @Override
    public String toString() {
        return "CoupeTrainCar{" +
                "Name=" + name+',' +
                "ComfortLevel=" + ComfortLevel + ',' +
                "NumbPassengers=" + NumbPassengers +',' +
                "NumbLuggage=" + NumbLuggage +
                '}';
    }


}
