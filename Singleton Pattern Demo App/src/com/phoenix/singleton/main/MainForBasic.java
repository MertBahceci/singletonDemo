package com.phoenix.singleton.main;

import com.phoenix.singleton.CustomSingleton;

/**
 * @author mert on 4.02.2023
 * @project Singleton Pattern Demo App
 */
public class MainForBasic {
    public static void main(String[] args) {
        CustomSingleton customSingleton = CustomSingleton.getInstance();
        customSingleton.setSniff("Bad sniff!");
        System.out.println(customSingleton.getSniff());

        CustomSingleton customSingleton2 = CustomSingleton.getInstance();
        System.out.println(customSingleton2.getSniff());
    }
}
