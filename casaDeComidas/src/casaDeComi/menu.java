package casaDeComi;

import java.util.Objects;
import java.util.Scanner;

public class menu {

    //atributos
    String [][] menu = new String[2][5];

    //constructor


    public menu() {
    }

    public void setMenu(String[][] menu) {
        this.menu = menu;
        int m;
        for (int i = 0; i < menu.length; i++) {
            for (int j = 0; j < menu[0].length; j++) {
                m = i + 1;

                Scanner lectura = new Scanner(System.in);
                if (j == 0) {
                    System.out.println("Ingrese la comida numero: " + m);
                } else {
                    System.out.println("Ingrese el ingrediente numero : " + j);
                }
                menu[i][j] = lectura.nextLine();
            }
        }
    }

        public void buscarCom(String[][] menu) {
            String comida;
            int cont=0;
            System.out.println("Que comida desea buscar");
            Scanner lectura = new Scanner(System.in);
            comida = lectura.nextLine();
            for(int i=0;i<menu.length;i++) {

                if(Objects.equals(comida, menu[i][0])){
                    cont++;
                    System.out.println("Para la comida: "+menu[i][0]);
                    System.out.println("Están disponibles estos ingredientes: ");
                    for(int j= 1; j < menu[0].length; j++) {
                        System.out.println(menu[i][j]);
                    }
                }


            }
            if(cont==0){
                System.out.println("El plato no se encuentra en el menú.");
            }

    }
        
}



