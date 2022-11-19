package casaDeComi;

import java.util.Scanner;

public class menu {

    //atributos
    String [][] menu = new String[20][5];

    //constructor


    public menu() {
    }

    public void setMenu(String[][] menu) {
        this.menu = menu;
        int m;
        for (int i = 0; i < menu.length; i++) {
            for (int j = 0; j < "m9ialmenu[0].length; j++) {
                m = i + 1;

                Scanner lectura = new Scanner(System.in);
                if(j==0){
                    System.out.println("Ingrese la comida numero: " + m);
                }
                else{
                    System.out.println("Ingrese el ingrediente numero : " +j);
                }
                menu[i][j] = lectura.next();
            }
        }

        public static void buscarComida(String[][] menu) {
        
        }

    }
}
