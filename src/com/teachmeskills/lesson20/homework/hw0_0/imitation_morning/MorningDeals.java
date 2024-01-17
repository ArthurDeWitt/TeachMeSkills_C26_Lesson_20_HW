package com.teachmeskills.lesson20.homework.hw0_0.imitation_morning;

public class MorningDeals implements Runnable {
    private String dealName;
    private int priority;

    public MorningDeals(String dealName, int priority) {
        this.dealName = dealName;
        this.priority = priority;
    }

    public void run() {
        Thread.currentThread().setPriority(priority);
        System.out.println("Running " + dealName + ". Stream " + Thread.currentThread().getName());
    }
}
