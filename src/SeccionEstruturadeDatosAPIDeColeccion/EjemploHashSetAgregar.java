package SeccionEstruturadeDatosAPIDeColeccion;

import java.util.*;

public class EjemploHashSetAgregar {
    public static void main(String[] args) {
        //List<String> hs=new ArrayList<>();
       Set<String> hs=new HashSet<>(); //tantos como los metodos list y set comparten la misma interfaz
        //todos estos retornan true por que no son duplicados
        System.out.println(hs.add("uno"));
        System.out.println(hs.add("dos"));
        System.out.println(hs.add("tres"));
        System.out.println(hs.add("cuatro"));
        System.out.println(hs.add("cinco"));
        System.out.println(hs);

       boolean b= hs.add("tres");
        //sort para ordenar listas, solo  los List se pueden ordenar los Set no poque marca Error
       //para poder ordenarlo se debe convertir a un List
        List<String> lista=new ArrayList<>(hs);//se pasa el HashSet como constructor
        Collections.sort(lista);
        System.out.println("permite elementos duplicados = " + b);
        System.out.println(lista);

    }
}
