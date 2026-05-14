import main.Paquete;
    import main.Camion;

    import java.util.List;
    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.LinkedList;

    public class Servicios {
        //HashMaps para almacenar toda la información de los paquetes, dado sun código de paquete
        private HashMap<String, Paquete> PaquetePorCodigo;
        //Listas para almacenar los paquetes que contienen o no alimentos
        private HashMap<Boolean, List<Paquete>> PaquetePorAlimentos;
        // lista de paquetes
        private List<Paquete> paquetes;
        //Árbol de búsqueda binaria para almacenar los paquetes por su nivel de urgencia
        private BinarySearchTreePaquete paqueteBST;

        //constructor
        public Servicios(String pathCamiones, String pathPaquetes)
        {
             PaquetePorCodigo = new HashMap<>();
             PaquetePorAlimentos = new HashMap<>();
             PaquetePorAlimentos.put(true,new ArrayList<>());
            PaquetePorAlimentos.put(false,new ArrayList<>());

        }

        //Complejidad temporal del servicio 1: O(1), ya que se accede directamente al paquete a través de su código utilizando un HashMap.
        /*
        Servicio 1: Dado un código de paquete (String), retornar toda la información
        del paquete asociado. En caso de no existir, retornar null.
         */

        public Paquete servicio1(String codigoPaquete) {
            return PaquetePorCodigo.get(codigoPaquete);
         }
        /*Complejidad temporal del servicio 2: O(1),
             porque en el constructor ya separé los paquetes
              en dos listas: los que tienen alimentos y los que no.
             Entonces, cuando llamo al servicio, no necesito recorrer
             nada, simplemente devuelvo la lista que corresponde.
            */
        /*
        Servicio 2: Dado un booleano que indica si se buscan paquetes que
        contienen alimentos (true) o que no contienen alimentos (false), retornar el listado de paquetes correspondiente.
        */

        public List<Paquete> servicio2(boolean contieneAlimentos) {
         return PaquetePorAlimentos.get(contieneAlimentos);
        }
        /*
        Complejidad temportal del servicio 3: O(n), donde n es el número de paquetes, ya que se recorre la lista de paquetes para verificar si su nivel de urgencia está dentro del rango especificado.
        */

        public List<Paquete> servicio3(int urgenciaMinima, int
        urgenciaMaxima) {
            List<Paquete> resultado = new ArrayList<>();

            for (Paquete paquete : paquetes) {
                if (paquete.getNivel_urgencia() >= urgenciaMinima && paquete.getNivel_urgencia() <= urgenciaMaxima) {
                    resultado.add(paquete);
                }
            }
            return resultado;
        }

    }
