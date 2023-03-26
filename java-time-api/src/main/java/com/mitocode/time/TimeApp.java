package com.mitocode.time;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

public class TimeApp {

    private void m1Basics() {
        LocalTime now = LocalTime.now();
        LocalTime specific = LocalTime.of(15,30,20);
        LocalTime later = now.plusMinutes(30);
        boolean before = now.isBefore(later);
        boolean after = now.isAfter(later);

        System.out.println("Now: " + now);
        System.out.println("Specific: " +specific);
        System.out.println("30 min later: " + later);
        System.out.println("Now < Later: " + before);
        System.out.println("Now > Later: " + after);
    }

    private void m2DiffTimezone() {
        //ZoneId.getAvailableZoneIds().forEach(System.out::println);
        ZoneId zone1 = ZoneId.of("Europe/Madrid");
        ZoneId zone2 = ZoneId.of("America/Lima");


        LocalTime time1 = LocalTime.now(zone1);
        LocalTime time2 = LocalTime.now(zone2);

        System.out.println(zone1+ ": " + time1);
        System.out.println(zone2+ ": " + time2);

        long hours = ChronoUnit.HOURS.between(time1, time2);
        long minutes = ChronoUnit.MINUTES.between(time1, time2);

        System.out.println(hours);
        System.out.println(minutes);
    }

    public void m3Instant() {
        Instant inst1 = Instant.now();
        System.out.println(inst1);

        Instant inst2 = inst1.plus(1, ChronoUnit.DAYS);
        System.out.println(inst2);
    }

    public void m4FormatDate(){
        LocalDate date = LocalDate.now();
        System.out.println(date);

        String dateformat1 = date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        String dateformat2 = date.format(DateTimeFormatter.BASIC_ISO_DATE);

        System.out.println(dateformat1);
        System.out.println(dateformat2);

        LocalDate localDate1 = LocalDate.parse("2023-01-28");
        LocalDate localDate2 = LocalDate.parse("28-01-2023", DateTimeFormatter.ofPattern("dd-MM-yyyy"));

        System.out.println(localDate1);
        System.out.println(localDate2);

    }

    public static void main(String[] args) {
        TimeApp app = new TimeApp();

//        app.m1Basics();
//        app.m2DiffTimezone();
//        app.m3Instant();
        app.m4FormatDate();
    }
}
