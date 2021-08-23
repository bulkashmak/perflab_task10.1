package ru.bulkashmak;

import java.util.Random;

public class Casino {

    static Random random = new Random();

    private static final String[] winOrLose = {"You've won", "You've lost"};

    @Startup(name = "poker")
    public static void poker() {
        StackTraceElement[] stackTraceElements = (new Throwable()).getStackTrace();

        System.out.println(stackTraceElements[0].getMethodName().toUpperCase() +
                String.format(
                        " $$$ %s: %d",
                        winOrLose[random.nextInt(2)],
                        random.nextInt(10000)));
    }
    @Startup(name = "roulette")
    public static void roulette() {
        StackTraceElement[] stackTraceElements = (new Throwable()).getStackTrace();

        System.out.println(stackTraceElements[0].getMethodName().toUpperCase() +
                String.format(
                        " $$$ %s: %d",
                        winOrLose[random.nextInt(2)],
                        random.nextInt(10000)));
    }
    @Startup(name = "blackjack")
    public static void blackjack() {
        StackTraceElement[] stackTraceElements = (new Throwable()).getStackTrace();

        System.out.println(stackTraceElements[0].getMethodName().toUpperCase() +
                String.format(
                        " $$$ %s: %d",
                        winOrLose[random.nextInt(2)],
                        random.nextInt(10000)));
    }
    public static void wheelOfFortune() {
        StackTraceElement[] stackTraceElements = (new Throwable()).getStackTrace();

        System.out.println(stackTraceElements[0].getMethodName().toUpperCase() +
                String.format(
                        " $$$ %s: %d",
                        winOrLose[random.nextInt(2)],
                        random.nextInt(10000)));
    }
    public static void baccarat() {
        StackTraceElement[] stackTraceElements = (new Throwable()).getStackTrace();

        System.out.println(stackTraceElements[0].getMethodName().toUpperCase() +
                String.format(
                        " $$$ %s: %d",
                        winOrLose[random.nextInt(2)],
                        random.nextInt(10000)));
    }
    public static void slotMachine() {
        StackTraceElement[] stackTraceElements = (new Throwable()).getStackTrace();

        System.out.println(stackTraceElements[0].getMethodName().toUpperCase() +
                String.format(
                        " $$$ %s: %d",
                        winOrLose[random.nextInt(2)],
                        random.nextInt(10000)));
    }
}
