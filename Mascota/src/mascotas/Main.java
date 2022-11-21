package mascotas;

import java.util.ArrayList;



public class Main {

    public static void main(String[] args) {

       //      Crear una clase Mascota, que tenga los siguientes atributos: nombre, especie, sexo, color, pelaje
        //     y raza (tener en cuenta todos sus atributos, constructores y métodos getters y setters). A partir
        //     de ello:
        //
        //a.    Crear un ArrayList de tipo Mascota. Crear 5 mascotas y guardarlas en la lista.
        //
        //b.    Recorrer la lista creada y mostrar por pantalla el nombre, especie y pelaje de las mascotas
        //      almacenadas.
        //
        //c.    Durante el recorrido, cambiar el nombre de dos mascotas. Volver a recorrer la lista y mostrar
        //      los nuevos datos
        //
        //d.    Agregar dos nuevas mascotas a la lista.
        //
        //e.    Recorrer la lista pero solo mostrando las mascotas que sean de la especie “perro”.

        /**
         *
         * @author Adrian Latorre
         */

        ArrayList<Mascota> misMascotas= new ArrayList<>();

        Mascota mascota1 = new Mascota("pinta","gato","hembra","blanco","corto",
                "birmano");
        Mascota mascota2 = new Mascota("diablo","perro","macho","negro","largo",
                "Terrier" );
        Mascota mascota3 = new Mascota("Globo","pez","macho","naranja","sin",
                "leviste");
        Mascota mascota4 = new Mascota("lobo","perro","macho","negro marron","corto",
                "Ovejero");
        Mascota mascota5 = new Mascota("bruma","gato","macho","beige","coto",
                "siames");

        misMascotas.add(mascota1);
        misMascotas.add(mascota2);
        misMascotas.add(mascota3);
        misMascotas.add(mascota4);
        misMascotas.add(mascota5);


        for (int i=0; i<misMascotas.size(); i++) {
            System.out.println(misMascotas.get(i).getNombre() +" "+ misMascotas.get(i).getEspecie()+" " + misMascotas.get(i).getPelaje());

            switch(i){
                case 1:

                misMascotas.get(i).setNombre("Sombra");
                break;
                case 2:
                    misMascotas.get(i).setNombre("Pinupo");


                    break;
            }

        }

        System.out.println("Nueva lista de mascotas: ");

        for (int i=0; i<misMascotas.size(); i++) {
            System.out.println(misMascotas.get(i).getNombre() +" "+ misMascotas.get(i).getEspecie()+" " + misMascotas.get(i).getPelaje());

        }

        Mascota mascota6 = new Mascota("silvo","perro","macho","negro marron","corto",
                "Ovejero");
        Mascota mascota7 = new Mascota("luz","gato","hembra","beige","coto",
                "siames");

        misMascotas.add(mascota6);
        misMascotas.add(mascota7);

        System.out.println("Solo especie perro");

        for (int i=0; i<misMascotas.size(); i++) {
            if(misMascotas.get(i).getEspecie().equals("perro")) {
                System.out.println(misMascotas.get(i).getNombre() +" "+ misMascotas.get(i).getEspecie()+" "
                        + misMascotas.get(i).getPelaje());

            }

        }














    }
}