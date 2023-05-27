package me.whyauthentic.javautils;

import java.text.SimpleDateFormat;

public class TimeDate {

    public static String DATE() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        java.util.Date date = new java.util.Date();
        return formatter.format(date);
    }

    public static String TIME() {
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        java.util.Date date = new java.util.Date();
        return formatter.format(date);
    }

    public static String DATE_TIME() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        java.util.Date date = new java.util.Date();
        return formatter.format(date);
    }

}
