package com.mitocode.switchenh;

import com.mitocode.record.Product;

public class SwitchApp {

    private void m1Classic(String param) {
        switch (param) {
            case "A":
                System.out.println("Case A");
                break;
            case "B":
                System.out.println("Case B");
                break;
            default:
                System.out.println("Case C");
        }
    }

    private void m2Arrow(String param) {
        switch (param) {
            case "A" -> System.out.println("Case A");
            case "B" -> System.out.println("Case B");
            default -> System.out.println("Case C");
        }
    }

    private String m3Yield(String param) {
        return switch (param) {
            case "A":
                yield "Case A";
            case "B":
                yield "Case B";
            default:
                yield "Default Case";
        };
    }

    private String m4ArrowReturn(String param){
        return switch (param) {
            case "A" -> "Case A";
            case "B" -> "Case B";
            default -> "Default Case";
        };
    }

    private String m5MultipleCase(String param){
        return switch (param) {
            case "A", "B" -> "Case A, B";
            case "C" -> "Case C";
            default -> "Default Case";
        };
    }

    ///////////preview///////////////
    private String m6PatternMatcher(Object param){
        return switch (param){
            case String a -> "Case String";
            case Integer b -> "Case Integer";
            case Product p -> "Case Product";
            default -> "Default case";
        };
    }

    private String m7PatternMatcher(Object param){
        return switch (param){
            case String a -> "Case String";
            case Integer b && b < 5 -> "Case Integer";
            case Product p && p.getId() > 1 -> "Case Product";
            default -> "Default case";
        };
    }

    private String m8Nulls(Object param){
        return switch (param){
            case String a -> "Case String";
            case Integer b && b < 5 -> "Case Integer";
            case Product p && p.getId() > 0 -> "Case Product";
            case null -> "Case null";
            default -> "Default case";
        };
    }


    public static void main(String[] args) {
        SwitchApp app = new SwitchApp();
        //app.m2Arrow("A");
        //String result = app.m5MultipleCase("A");
        String result = app.m8Nulls(null);
        System.out.println(result);
    }
}
