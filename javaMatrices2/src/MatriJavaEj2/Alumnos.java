package MatriJavaEj2;


import java.util.Scanner;

public class Alumnos {

    //atributos
    double matAlum[][] = new double[10][4];


    //constructor


    public Alumnos() {

    }

    //metodos

    public double[][] ingrNotas(double[][] notas) {
        this.matAlum = notas;
        int p;
        int m;

        for (int i = 0; i < matAlum.length; i++) {
            for (int j = 0; j < (matAlum[0].length) - 1; j++) {
                m = i + 1;
                p = j + 1;
                Scanner lectura = new Scanner(System.in);
                System.out.println("Ingrese la nota del Alumno: " + m + " del la materia: " + p);
                matAlum[i][j] = lectura.nextInt();

            }

        }
        return matAlum;

    }

    public double[][] promNot(double[][] notas) {

        double valorAnterior = 0;
        for (int i = 0; i < notas.length; i++) {
            valorAnterior = 0;
            for (int j = 0; j < (notas[0].length)-1; j++) {
                valorAnterior = valorAnterior + notas[i][j];
            }
            notas[i][3] = Math.round((valorAnterior / 3) * 100) / 100d;
        }
        matAlum=notas;




        return matAlum;

    }

    public static void imprProm(double[][] imp) {


        System.out.println("Los promedios son los siguientes: ");
        for (int i = 0; i < imp.length; i++){
            System.out.println(imp[i][(imp[0].length)-1]);

        }
    }
}
