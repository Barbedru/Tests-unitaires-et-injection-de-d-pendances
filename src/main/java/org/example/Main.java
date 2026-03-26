package org.example;


public class Main {
    public static void main(String[] args) {
        Welcome welcome = new Welcome(new RealClock());
        String message = welcome.getMessage();
        System.out.println(message);

        }
    }
