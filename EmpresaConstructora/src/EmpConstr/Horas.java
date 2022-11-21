package EmpConstr;

import java.util.Scanner;

public class Horas {

    //Atributos

    int[][] horasT = new int[15][6];
    int[][] horasE = new int[15][6];

    //Contructor


    public Horas() {
    }

    //Metodos


    public void setHorasT(int[][] horasT, int[][] horasE) {
        this.horasT = horasT;
        int m = 0;
        int em = 0;
        for (int i = 0; i < horasT.length; i++) {
            em=i+1;

            for (int j = 0; j < horasT[i].length; j++) {
                m = j + 1;
                Scanner lectura = new Scanner(System.in);
                System.out.println("Ingrese horas del mes: " + m+ " del empleado: "+em);
                horasT[i][j] = lectura.nextInt();
                if (horasT[i][j] > 160) {
                    horasE[i][j] = horasT[i][j] - 160;
                } else {
                    horasE[i][j] = 0;
                }
            }
        }

    }

    public static void imprExtras(int[][]horasE){
        int em=0;
        System.out.println("Las horas extras son las siguientes: ");
        for(int i=0; i<horasE.length; i++){
            em=i+1;
            System.out.println("Para el empleado: "+em);
            for(int j=0; j<horasE[0].length; j++){
                System.out.print(horasE[i][j] + " ");}
            System.out.println();

            }
        }



    }



