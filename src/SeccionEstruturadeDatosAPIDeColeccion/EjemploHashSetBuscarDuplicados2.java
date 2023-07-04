package SeccionEstruturadeDatosAPIDeColeccion;

/*
Author: Rolando Salinas
Correo: rolycore@gmail.com
 */

import java.util.HashSet;
import java.util.Set;


public class EjemploHashSetBuscarDuplicados2 {
    public static void main(String[] args) {
        //arreglo
        String[] peces={"Tiburon", "Mero", "", "Corvina", "Corvina", "Lenguado", "", "Pejerrey", "Robalo", "Atun", "", "Lenguado"};
        //creamos los sets Unicos y Duplicados
        Set<String> unicos= new HashSet<>();
        Set<String> duplicados= new HashSet<>();
        //iteramos los que son Unicos
        for (String pez: peces){
            //el metodo add como es booleano valida si son unicos
            if(!unicos.add(pez)){
                duplicados.add(pez);
            }
        }
        //eliminamos todos los duplicados
        unicos.removeAll(duplicados);
        System.out.println("Elementos que son unicos: " + unicos);
        System.out.println("Elementos que son duplicados: " + duplicados);
    }
}
