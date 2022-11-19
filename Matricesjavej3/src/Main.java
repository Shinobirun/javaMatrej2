public class Main {
    public static void main(String[] args) {

        // Se desea un programa que sea capaz de rellenar completamente con números 1 una matriz de 4 x 4 a
        // excepción de su diagonal principal, la cual debe ser rellenada con números 0. Una vez realizada la
        // carga, se desea mostrar la matriz de forma ordenada por pantalla. Tener como ejemplo la matriz que
        // se presenta a continuación.
        cMatNum(4,4,1);

        public static void cMatNum(int l, int m,
    } int n) {
        int[][] matri = new int[l][m];
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < m; j++) {
                if (i == j) {
                    matri[i][j] = 0;
                } else {
                    matri[i][j] = n;
                }
            }
        }

        for(int i = 0; i < matri.length; i++){
            for(int j = 0; j < matri[i].length; j++){
                System.out.print(matri[i][j] + " ");}
            System.out.println();}

    }



}