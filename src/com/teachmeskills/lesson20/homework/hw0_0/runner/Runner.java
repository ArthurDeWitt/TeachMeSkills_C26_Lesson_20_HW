package com.teachmeskills.lesson20.homework.hw0_0.runner;

import com.teachmeskills.lesson20.homework.hw0_0.imitation_morning.MorningDeals;

import java.io.FileInputStream;
import java.util.Properties;

public class Runner {
    public static void main(String[] args) {
        Properties prop = new Properties();
        try {
            prop.load(new FileInputStream("C:\\Projects\\TeachMeSkills_C26_Lesson_20_HW\\src\\com\\teachmeskills\\lesson20\\homework\\hw0_0\\config\\config_properties"));
            String[] activities = {"Reading news", "Breakfast", "Coffee Break"};
            for (int i = 0; i < 3; i++) {
                String activity = activities[i];
                int priority = Integer.parseInt(prop.getProperty("priority_" + (i + 1)));
                Thread t = new Thread(new MorningDeals(activity, priority), "Stream " + (i + 1));
                t.start();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
