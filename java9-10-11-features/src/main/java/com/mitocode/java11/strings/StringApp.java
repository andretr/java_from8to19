package com.mitocode.java11.strings;

public class StringApp {

    private void stringMethods(String text){
        boolean result1 = text.isBlank();
        boolean result2 = text.isEmpty();

        /*text.lines().filter(line -> !line.isBlank())
                        .forEach(System.out::println);*/
        //System.out.println(result1);
        //System.out.println(result2);

        String strip = text.strip();
        System.out.println(strip);

        String stripLeading = text.stripLeading();
        System.out.println(stripLeading);

        String stripTrailing = text.stripTrailing();
        System.out.println(stripTrailing);

        String repeat = text.repeat(3);
        System.out.println(repeat);
    }

    private void stripVSTrim(String text) {
        String resultTrim = text.trim();
        String resultStrip = text.strip();

        System.out.println(resultTrim);
        System.out.println(resultStrip);
    }

    public static void main(String[] args) {
        StringApp app = new StringApp();
        //app.stringMethods(" ");
        //app.stringMethods("mitocode \n suscribete \n al canal");
        //app.stringMethods("    mitocode    ");
        app.stripVSTrim("    mitocode \u2003    ");

    }
}
