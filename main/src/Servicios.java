package main;

import java.util.List;
import java.util.HashMap;
import java.util.LinkedList;



public class Servicios {
//Completar con las estructuras y métodos privados que se requieran.
/*
* Expresar la complejidad temporal del constructor.
*/
//HashMaps para almacenar toda la información de los paquetes, dado sun código de paquete
private HashMap<String, Paquete> paquetes;

//Listas para almacenar los paquetes que contienen o no alimentos
private List<Paquete> paquetesConAlimentos;
private List<Paquete> paquetesSinAlimentos;

//Árbol de búsqueda binaria para almacenar los paquetes por su nivel de urgencia
private BinarySearchTreePaquete paqueteBST;


public Servicios(String pathCamiones, String pathPaquetes)
{

    paquetes = new HashMap<>();
    paquetesConAlimentos = new LinkedList<>();
    paquetesSinAlimentos = new LinkedList<>();
    paqueteBST = new BinarySearchTreePaquete();

}
/*
* Expresar la complejidad temporal del servicio 1.
*/
public Paquete servicio1(String codigoPaquete) { }
/*
* Expresar la complejidad temporal del servicio 2.
*/
public List<Paquete> servicio2(boolean contieneAlimentos) {
}
/*
* Expresar la complejidad temporal del servicio 3.
*/
public List<Paquete> servicio3(int urgenciaMinima, int
urgenciaMaxima) { }
}
