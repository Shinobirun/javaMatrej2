package com.madesarrolloweb;

public class Funciones {
    public static void main(String[] args) {

        holaMundo();
        holaMundo("Parri");





    }

    public static void holaMundo() {
        System.out.println("Hola mundo dedes un metodo");
    }

    public static  void holaMundo(String name) {
        System.out.println("Hola mundo dedes un metodo " + name);
    }

    public static  void holaMundo(String name, String surname) {
        System.out.println("Hola mundo dedes un metodo " + name);
    }


}
