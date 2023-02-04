package com.phoenix.singleton;

/**
 * @author mert on 4.02.2023
 * @project Singleton Pattern Demo App
 */
public class CustomSingleton {

    private String sniff;

    public CustomSingleton() {
    }

    private CustomSingleton(String sniff){
        this.sniff = sniff;
    }

    public String getSniff() {
        return sniff;
    }

    public void setSniff(String sniff) {
        this.sniff = sniff;
    }

    private static class SingletonProvider{
        private static final CustomSingleton CUSTOM_SINGLETON =  new CustomSingleton();

    }

    public static CustomSingleton getInstance(){
        return SingletonProvider.CUSTOM_SINGLETON;
    }
}
