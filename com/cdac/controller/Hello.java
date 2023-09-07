package com.cdac.controller;
import java.io.IOException;
import java.util.Scanner;

import javafx.scene.transform.Scale;

enum DayOfWeek {
    MONDAY(0), TUESDAY(1), WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    private int n;

    DayOfWeek(int n) {
        this.n = n;
    }

    DayOfWeek() {
        this.n = 10;
    }
}

public class Hello {
    public static void main(String[] args) {
        DayOfWeek day = DayOfWeek.values()[0];
        Scanner sc = new Scanner("hello");
        System.out.println(sc.nextLine());
        // do {
        // switch (day) {
        // case MONDAY:
        // System.out.println("It's Monday!");
        // break;
        // case TUESDAY:
        // System.out.println("It's Tuesday!");
        // break;
        // case WEDNESDAY:
        // System.out.println("It's Wednesday!");
        // break;
        // case THURSDAY:
        // System.out.println("It's Thursday!");
        // break;
        // case FRIDAY:
        // System.out.println("It's Friday!");
        // break;
        // case SATURDAY:
        // System.out.println("It's Saturday!");
        // break;
        // case SUNDAY:
        // System.out.println("It's Sunday!");
        // break;
        // default:
        // System.out.println("Invalid day of the week.");
        // break;
        // }
        // } while (true);

        System.out.println();
        try {
            System.out.println(System.in.read());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
