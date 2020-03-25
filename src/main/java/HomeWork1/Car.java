package HomeWork1;

import HomeWork1.enums.CarType;
import HomeWork1.enums.EngineType;
import sun.font.LayoutPathImpl;

import java.util.ArrayList;
import java.util.Random;

public class Car {

    CarType carType;
    EngineType engineType;

    public Car(CarType carType, EngineType engineType){
        this.carType = carType;
        this.engineType = engineType;

    }

    public double getKilometers(){
        return carType.getAmountOfFuel() + carType.getFuelPerKm() + engineType.getCapability();
    }



    public static void main(String[] args) {
        int num = 3;

        ArrayList<Car>  carArrayList = new ArrayList<Car>();
        Car[] ourCars = new Car[num];

        Random carRandom = new Random();
        Random engineType = new Random();

        double totalKm = 0;

        for (int i = 0; i <4; i++ ){
            int cars = carRandom.nextInt(3);
            int engine = engineType.nextInt(3);
            Car car = new Car(CarType.values()[cars],EngineType.values()[engine]);
            carArrayList.add(car);
            totalKm = totalKm + carArrayList.get(i).getKilometers();
        }
        System.out.println(totalKm);


        for (int i =0; i<ourCars.length; i++){
            int cars = carRandom.nextInt(3);
            int engine = engineType.nextInt(3);

        ourCars[i] = new Car(CarType.values()[cars], EngineType.values()[engine]);
        totalKm = totalKm + ourCars[i].getKilometers();
    }
        System.out.println(totalKm);

    }

}
