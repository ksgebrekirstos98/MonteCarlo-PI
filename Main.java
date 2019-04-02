package com.jetbrains;
import java.util.Random;
public class Main {
//Monte Carlo method to approximate Pi
    public static void main(String[] args) {
        double x;
        double y;
        Random rand1;
        Random rand2;
        int counter = 0;
        int Total = 100000000;
        double pi;

        for (int i = 0; i < Total; i++)
        {
            rand1 = new Random();
            rand2 = new Random();
            x = -1.0 + (double)rand1.nextInt(3);
            y = -1.0 + (double)rand2.nextInt(3);
            if ((Math.pow(x,2) + Math.pow(y,2)) <= 1) {
                counter++;
            }
        }
        pi = 4.0*(double)counter / (double)Total;
        System.out.println("Pi is approximated to " + pi);

    }
}
