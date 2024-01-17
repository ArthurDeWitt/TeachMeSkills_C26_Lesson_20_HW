package com.teachmeskills.lesson20.homework.hw1.service;

import com.teachmeskills.lesson20.homework.hw1.constants.IConst;

public class AddToServiceCar implements Runnable {

    CarStation carStation;

    public AddToServiceCar(CarStation carStation) {
        this.carStation = carStation;
    }

    @Override
    public void run() {
        addToServiceCar();
    }

    private void addToServiceCar(){
        for (int i = 1; i <=IConst.CARS_TO_SERVICE; i++) {
            carStation.add();
        }
    }

}