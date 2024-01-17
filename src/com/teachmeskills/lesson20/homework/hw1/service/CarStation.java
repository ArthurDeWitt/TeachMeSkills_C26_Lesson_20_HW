package com.teachmeskills.lesson20.homework.hw1.service;

import com.teachmeskills.lesson20.homework.hw1.constants.IConst;

public class CarStation {
    private int cars = 0;

    public synchronized void add() {
        while (cars >= IConst.MAX_CAPACITY) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        cars++;
        System.out.println("The car was taken to the service station");
        System.out.println("Amount of the cars on the station service " + cars);
        notify();
    }

    public synchronized void take() {
        while (cars < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        cars--;
        System.out.println("The car finished machine maintenance");
        System.out.println("Amount of the cars on the station service " + cars);
        notify();
    }
}