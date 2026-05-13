import main.Paquete;
import main.Camion;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class Servicios {
//HashMaps para almacenar toda la información de los paquetes, dado sun código de paquete
private HashMap<String, Paquete> paquetes;
//Listas para almacenar los paquetes que contienen o no alimentos
private List<Paquete> paquetesConAlimentos;
private List<Paquete> paquetesSinAlimentos;
//Árbol de búsqueda binaria para almacenar los paquetes por su nivel de urgencia
private BinarySearchTreePaquete paqueteBST;

//constructor
public Servicios(String pathCamiones, String pathPaquetes)
{
//Completar
}

//Complejidad temporal del servicio 1: O(1), ya que se accede directamente al paquete a través de su código utilizando un HashMap.
/*
Servicio 1: Dado un código de paquete (String), retornar toda la información 
del paquete asociado. En caso de no existir, retornar null.
 */

public Paquete servicio1(String codigoPaquete) {
    return paquetes.get(codigoPaquete);
 }
//Complejidad temporal del servicio 2: O(n), donde n es el número de paquetes, ya que se recorre la lista de paquetes para verificar si contienen alimentos o no.
/*
Servicio 2: Dado un booleano que indica si se buscan paquetes que 
contienen alimentos (true) o que no contienen alimentos (false), retornar el listado de paquetes correspondiente. 
*/
public List<Paquete> servicio2(boolean contieneAlimentos) {
    List<Paquete> resultado = new ArrayList<>();    
    
    for (Paquete paquete : paquetes.values()) {
        if (paquete.getContiene_alimentos() == contieneAlimentos) {
            resultado.add(paquete);
        }
    }
    return resultado;
}
/*
Complejidad temportal del servicio 3: O(n), donde n es el número de paquetes, ya que se recorre la lista de paquetes para verificar si su nivel de urgencia está dentro del rango especificado.
*/

public List<Paquete> servicio3(int urgenciaMinima, int
urgenciaMaxima) { 
    List<Paquete> resultado = new ArrayList<>();

    for (Paquete paquete : paquetes.values()) {
        if (paquete.getNivel_urgencia() >= urgenciaMinima && paquete.getNivel_urgencia() <= urgenciaMaxima) {
            resultado.add(paquete);
        }
    }
    return resultado;
}

}
