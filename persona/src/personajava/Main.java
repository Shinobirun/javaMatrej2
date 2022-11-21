package personajava;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<Persona> lista= new LinkedList<Persona>();
        LinkedList<Persona> listaMay = new LinkedList<Persona>();
        LinkedList<Persona> listaMen = new LinkedList<Persona>();


        Persona persona1=new Persona(23987140,"Juan","Bianchi","Julian 321",113745656,22);
        Persona persona2=new Persona(21987140,"Juana","Bianchi","Julian 721",113745656,20);
        Persona persona3=new Persona(203987140,"Juanita","Branca","Julian 921",13745656,18);
        Persona persona4=new Persona(13987140,"Ana","Roth","Peru 321",113745656,32);

        lista.add(persona1);
        lista.add(persona2);
        lista.add(persona3);
        lista.add(persona4);

        for(int i=0; i < lista.size(); i++){
            if(lista.get(i).getEdad()>21){
                listaMay.add(lista.get(i));
            }
            else{
                listaMen.add(lista.get(i));
            }

            }

        System.out.println("Mayores");
        for(int i=0; i < listaMay.size(); i++){
            System.out.println(listaMay.get(i).getNombre()+" "+listaMay.get(i).getEdad());
        }
        System.out.println("Menores");
        for(int i=0; i < listaMen.size(); i++){
            System.out.println(listaMen.get(i).getNombre() +" "+ listaMen.get(i).getEdad());
        }





    }

}