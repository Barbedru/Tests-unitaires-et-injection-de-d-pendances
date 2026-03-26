package org.example;


public class Main {
    public static void main(String[] args) {

        // Injection de la vraie dépendance (temps réel)
        Welcome welcome = new Welcome(new RealClock());
        String message = welcome.getMessage();
        System.out.println(message);

        }
    }
