package com.example.CreatePassTrain;

public class Switch {
    private Command AddCoupe;
    private Command AddLuxury;
    private Command AddCommon;

    public Switch(Command AddLuxury,Command AddCoupe, Command AddCommon) {
        this.AddCoupe = AddCoupe;
        this.AddLuxury = AddLuxury;
        this.AddCommon = AddCommon;
    }

    public void AddCoupeCar(){
        AddCoupe.execute();
    }

    public void AddLuxuryCar(){
        AddLuxury.execute();
    }

    public void AddCommonCar(){
        AddCommon.execute();
    }

}
