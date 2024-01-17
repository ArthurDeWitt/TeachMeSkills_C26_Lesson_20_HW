package com.teachmeskills.lesson20.homework.hw1.runner;

import com.teachmeskills.lesson20.homework.hw1.service.AddToServiceCar;
import com.teachmeskills.lesson20.homework.hw1.service.CarStation;
import com.teachmeskills.lesson20.homework.hw1.service.TakeCar;

public class Runner {
    public static void main(String[] args) {

        CarStation carStation = new CarStation();

        AddToServiceCar addToServiceCar = new AddToServiceCar(carStation);
        Thread addThread = new Thread(addToServiceCar);
        addThread.start();

        TakeCar takeCar = new TakeCar(carStation);
        Thread takeThread = new Thread(takeCar);
        takeThread.start();
    }
}
