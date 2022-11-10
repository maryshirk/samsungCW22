package com.samsung;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static Logger logger;

    public static void main(String[] args) {
        String str = "Hello world!";
        String str1 = new String("Hello world!");
        System.out.print(str == str1);

        logger = Logger.getLogger(Main.class.getName());
        logger.log(Level.WARNING, "Сарт приложения");
        //...
        logger.log(Level.WARNING, "Конец приложения");
    }
}