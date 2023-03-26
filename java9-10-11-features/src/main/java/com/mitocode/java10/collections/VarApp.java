package com.mitocode.java10.collections;

import com.mitocode.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class VarApp {

    //private var age = 32; //PHOHIBIDO
    private int var = 45;

    private void m1Before(){
        int i = 32;
        double d = 1.5;
        char c = '@';
        boolean b = true;
        String str = "mitocode";
        List<Integer> list = List.of(15, 23, 444);
        Map<Integer, String> map = Map.of(1, "Java", 2, "C#", 3, "Kotlin");
    }

    private void m2After(){
        //var a;
        var i = 32;
        i = 35;
        var d = 1.5;
        var c = '@';
        var b = true;
        var str = "mitocode";
        var list = List.of(15, 23, 444);
        var map = Map.of(1, "Java", 2, "C#", 3, "Kotlin");
        //var x = null; //PROHIBIDO;
    }

    //No permitido
    /*private var m3(){

    }*/

    private void m4(){
        //var i = (a, b) -> a + b;
        //Error de compilacion, no permitido, una lambda necesita saber el tipo de forma explicita
    }

    private void m5(){
        List<Product> list = new ArrayList<>();

        for(Product p : list){
            String name = p.getName();
            System.out.println(name);
        }

        for(var p: list){
            var name = p.getName();
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        VarApp app = new VarApp();
        app.m5();
    }
}
