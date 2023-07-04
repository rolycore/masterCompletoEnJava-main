package SeccionEstruturadeDatosAPIDeColeccion;

/*
Author: Rolando Salinas
Correo: rolycore@gmail.com
 */

import java.util.HashSet;
import java.util.Set;


public class EjemploHashSetBuscarDuplicados {
    public static void main(String[] args) {
        //arreglo
        String[] peces={"Tiburon", "Mero", "", "Corvina", "Corvina", "Lenguado", "", "Pejerrey", "Robalo", "Atun", "", "Lenguado"};
        //Imprimiendo el arreglo
        for (String pez : peces) {
            System.out.println(pez);
        }
        //contar cuantos elementos existen en la lista
        int cantidadElementos = peces.length;//cantidad de elementos en el arreglo
        System.out.println("El arreglo 'peces' tiene " + cantidadElementos + " elementos.");
        //si existen elementos vacios
        int cantidadElementosNoVacios = 0;
        //iteramos si existen elementos vacios
        for (String pez : peces) {
            if (!pez.isEmpty()) {
                cantidadElementosNoVacios++;
            }
        }
        //muestra los elementos no vacios
        System.out.println("El arreglo 'peces' tiene " + cantidadElementosNoVacios + " elementos no vacíos.");
        //contamos los elementos vacios
        int cantidadElementosVacios = 0;
        for (String pez : peces) {
            if (pez.isEmpty()) {
                cantidadElementosVacios++;
            }
        }

        System.out.println("El arreglo 'peces' tiene " + cantidadElementosVacios + " elementos vacíos.");
        //buscamos los peces unicos
        Set<String> unicos=new HashSet<>();
        //Iteramos el arreglo con un for
        int cantidadElementosDuplicados=0;
        for (String pez:peces){
            if(!unicos.add(pez)){
                //detecta si existen duplicados y no son duplicados
                System.out.println("Elementos Duplicados: " + pez);
            }
            if(!unicos.add(pez)&& pez.isEmpty()){
                //cuenta los elementos duplicados
                cantidadElementosDuplicados++;
            }
        }
        System.out.println("Elementos Duplicados: " + cantidadElementosDuplicados);
        //mostramos la lista completa
        System.out.println(unicos.size() + " Elementos no duplicados: " + unicos);
    }
}
