package casaDeComi;

public class Main {
    public static void main(String[] args) {

        //  Una casa de comida rápida utiliza una matriz de 20 filas y 5 columnas para determinar cada plato
        //  del menú y sus correspondientes ingredientes que contiene. Para ello, cada fila representa un plato
        //  principal en donde en la primera columna se especifica su nombre (por ejemplo: Milanesa), y en las
        //  demás los posibles acompañamientos que puede tener el plato (por ejemplo, puré, ensalada rusa,
        //  papas fritas, ensalada de lechuga y tomate, ensalada de zanahoria, etc). En caso de que tenga el
        //  plato menos de 4 tipos de acompañamiento, en la matriz se cargará la palabra Ninguno en las
        //  posiciones que queden vacías.
        //
        //Se desea un programa que sea capaz de permitir la carga de la matriz, de buscar un plato en particular
        // que un cliente ingrese por teclado y mostrarle de forma automática los posibles acompañamientos del
        // mismo.

        menu resto = new menu();

        resto.setMenu(resto.menu);
        resto.buscarCom(resto.menu);

    }
}