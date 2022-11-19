package com.madesarrolloweb;

public class WhileLoop {
    public static void main(String[] args) {
        boolean check = true;
        int count = 0;

        while (count < 10) {
            System.out.println("Hola");
            count++;
            if (count == 6)
                continue;
            System.out.println(count);

        }
         count=0;

        while (count < 10) {
            System.out.println("Hola");
            count++;
            if (count == 6)
                break;
            System.out.println(count);
        }
    }}
