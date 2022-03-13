package com.company;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;
import java.util.TimeZone;

public class Main5 {

    public static void main(String[] args) {
        Date now = new Date();
        SimpleDateFormat formatter= new SimpleDateFormat("HH:mm:ss");
        TimeZone.setDefault( TimeZone.getTimeZone("GMT"));
        System.out.println("Global time: " + formatter.format(now.getTime()));
        LocalTime time = LocalTime.now();
        System.out.println("Local time: " + time);
    }
}
