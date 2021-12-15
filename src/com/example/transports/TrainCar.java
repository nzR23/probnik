package com.example.transports;

public abstract class TrainCar {
    protected String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public TrainCar(String name) {
        this.name = name;
    }

    public abstract int getComfortLevel();
    public abstract int getNumbPassengers();
    public abstract int getNumbLuggage();
    public abstract void setComfortLevel(int i);
    public abstract void setNumbPassengers(int i);
    public abstract void  setNumbLuggage(int i);

}
