package com.teachmeskills.lesson20.homework.hw1.service;

import com.teachmeskills.lesson20.homework.hw1.constants.IConst;

public class TakeCar implements Runnable{

    CarStation carStation;

    public TakeCar(CarStation carStation) {
        this.carStation = carStation;
    }

    @Override
    public void run() {
        takeCar();
    }

    private void takeCar(){
        for (int i = 1; i <= IConst.CARS_TO_SERVICE; i++) {
            carStation.take();
        }
    }

}
