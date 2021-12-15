package com.example.transports;

import java.util.Scanner;

import com.example.CreatePassTrain.*;
import java.util.*;
public class UserInterface {
    public void start(){
    Scanner scanner = new Scanner(System.in);

    List<TrainCar> trainCars = new ArrayList<TrainCar>();

    CreateTrainCars cars = new CreateTrainCars(trainCars);

    Command AddLuxury = new CommandAddLuxury(cars);
    Command AddCoupe = new CommandAddCoupe(cars);
    Command AddLuggage = new CommandAddCommon(cars);


    Switch s = new Switch(AddLuxury,AddCoupe,AddLuggage);

    String mass;

        System.out.println("Якщо хочете відкрити меню введіть - 'menu' ");
        while (true) {

        mass=scanner.nextLine();
        if (mass.equals("menu")){
            menu();
        }

        if (mass.equals("AddTrainCar")) {
            System.out.println("Кількість нових вагонів:");
            int n = scanner.nextInt();
            for (int i = 0; i < n; i++) {
                System.out.println("Виберіть вагон:\n1-Luxury\n2-Coupe\n3-Common");
                int c = scanner.nextInt();
                if (c == 1) {
                    s.AddLuxuryCar();
                } else if (c == 2)
                    s.AddCoupeCar();
                if (c == 3)
                    s.AddCommonCar();
            }
        }
        if (mass.equals("PrintTrainCar")) {
            System.out.println("Пасажирні вагони:");
            print(trainCars);
        }
        if (mass.equals("PrintNumbPass")) {
            System.out.println("Кількість пасажирів");
            System.out.println(NumbPassengers(trainCars, 1));
        }
        if (mass.equals("PrintNumbLuggage")) {
            System.out.println("Кількість багажу");
            System.out.println(NumbPassengers(trainCars, 2));
        }
        if (mass.equals("SortPass")) {
            Comparator<TrainCar> comparator = SortList();
            Collections.sort(trainCars, comparator);

            System.out.println("Відсортовані в порядку зростання кількості пасажирів пасажирні вагони:");
            print(trainCars);
        }
        if(mass.equals("exit")){
            return;
        }
    }
}

    public static void menu(){
        System.out.println("Список команд");
        System.out.println("AddTrainCar - якщо хочете добавити вагон до потяга");
        System.out.println("PrintTrainCar - якщо хочете вивести вагони потяга");
        System.out.println("PrintNumbPass - якщо хочете вивести кількість багажу");
        System.out.println("PrintNumbLuggage - якщо хочете вивести кількість багажу");
        System.out.println("SortPass - якщо хочете відсортувати вагони ");
        System.out.println("exit - якщо хочете закінчитити виконання програми");
    }

    public static void print(List<TrainCar> trainCars){
        if (trainCars.size()==0)
            System.out.println("Вагонів немає!!!");

        for (int i=0;i<trainCars.size();i++)
            System.out.println(trainCars.get(i));
    }


    public static Comparator SortList(){
        Comparator<TrainCar> comparator = new Comparator<TrainCar>() {
            @Override
            public int compare(TrainCar min, TrainCar max) {
                return min.getNumbPassengers() - max.getNumbPassengers();
            }
        };
        return comparator;
    }

    public static int NumbPassengers(List<TrainCar> trainCars,int j) {
        int sum = 0;
        for (int i = 0; i < trainCars.size(); i++) {
            if (j == 1)
                sum += trainCars.get(i).getNumbPassengers();
            else if (j == 2)
                sum += trainCars.get(i).getNumbLuggage();
        }
        return sum;
    }
}

