package com.example.CreatePassTrain;

import com.example.transports.*;

import java.util.List;

public class CreateTrainCars {
    private List<TrainCar> PassList;
    public CreateTrainCars(List<TrainCar> passList) {
        PassList = passList;
    }

    public void  CreateCopeTrainCarr(){
        PassList.add(new CoupeTrainCar("CopeCar",5,30,15));
    }

    public void CreateLuxuryTrainCarr(){

        PassList.add(new LuxuryTrainCar("LuxuryCar",10,8));
    }

    public void CreateCommonTrainCarr(){

        PassList.add(new CommonTrainCar("LuggageCar",3,50,60));
    }
}
