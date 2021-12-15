package com.example.transports;

public class LuxuryTrainCar extends TrainCar{
    private int ComfortLevel;
    private int NumbPassengers;

    public LuxuryTrainCar(String name,int ComforLevel,int NumbPassengers){
        super(name);
        this.ComfortLevel=ComforLevel;
        this.NumbPassengers=NumbPassengers;
    }
    @Override
    public int getComfortLevel() {
        return ComfortLevel;
    }

    @Override
    public int getNumbPassengers() {
        return NumbPassengers;
    }

    @Override
    public int getNumbLuggage() {return 0;}

    @Override
    public void setNumbPassengers(int numbPassengers) {
        NumbPassengers = numbPassengers;
    }

    @Override
    public void setComfortLevel(int comfortLevel) {
        ComfortLevel = comfortLevel;
    }

    @Override
    public void setNumbLuggage(int i) {}

    @Override
    public String toString() {
        return "LuxuryTrainCar{" +
                "Name=" + name+',' +
                "ComfortLevel=" + ComfortLevel + ',' +
                "NumbPassengers=" + NumbPassengers +',' +
                "NumbLuggage=" + 0 +
                '}';
    }

}
