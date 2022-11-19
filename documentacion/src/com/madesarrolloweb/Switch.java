package com.madesarrolloweb;

public class Switch {
    public static void main(String[] args) {

        String weather="soleado";

        switch (weather) {
            case "soleado":
                System.out.println("Esta soleado");
                break;
            case "nublado":
                System.out.println("Esta nublado");
                break;

                default:
                    System.out.println("No se recibio clima");
                    break;

        }

    }
}
