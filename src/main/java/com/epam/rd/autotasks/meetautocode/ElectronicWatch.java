package com.epam.rd.autotasks.meetautocode;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import static java.time.temporal.ChronoField.*;

public class ElectronicWatch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();

        if (seconds >= 86400) {
            seconds = seconds - 86400;
        }

        LocalTime time = LocalTime.ofSecondOfDay(seconds);

        int hours = time.getHour();
        int min = time.getMinute();
        int sec = time.getSecond();

        System.out.print(hours <= 0 ? "0" : hours);
        System.out.print(":");
        System.out.print(min == 0 ? "00" : min < 10 ? "0" + min : min);
        System.out.print(":");
        System.out.print(sec == 0 ? "00" : sec < 10 ? "0" + sec : sec);
    }
}


