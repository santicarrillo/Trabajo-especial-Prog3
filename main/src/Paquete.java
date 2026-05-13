package main;

public class Paquete {
    private int id_paquete;
    private String codigo_paquete;
    private int peso_kg;
    private Boolean contiene_alimentos;
    private int nivel_urgencia;
    //<paqetes totales>

    public Paquete(int id_paquete, String codigo_paquete, int peso_kg, Boolean contiene_alimentos, int nivel_urgencia) {
        this.id_paquete = id_paquete;
        this.codigo_paquete = codigo_paquete;
        this.peso_kg = peso_kg;
        this.contiene_alimentos = contiene_alimentos;
        this.nivel_urgencia = nivel_urgencia;
    }

    public int getId_paquete() {
        return id_paquete;
    }

    public void setId_paquete(int id_paquete) {
        this.id_paquete = id_paquete;
    }

    public String getCodigo_paquete() {
        return codigo_paquete;
    }

    public void setCodigo_paquete(String codigo_paquete) {
        this.codigo_paquete = codigo_paquete;
    }

    public int getPeso_kg() {
        return peso_kg;
    }

    public void setPeso_kg(int peso_kg) {
        this.peso_kg = peso_kg;
    }

    public Boolean getContiene_alimentos() {
        return contiene_alimentos;
    }

    public void setContiene_alimentos(Boolean contiene_alimentos) {
        this.contiene_alimentos = contiene_alimentos;
    }

    public int getNivel_urgencia() {
    
        return nivel_urgencia;
    }

    public void setNivel_urgencia(int nivel_urgencia) {
            if(nivel_urgencia < 1 || nivel_urgencia > 100){
                System.out.println("Error: el nivel de urgencia debe ser un numero entre 1 y 100");
            }else{
                this.nivel_urgencia = nivel_urgencia;
        }
    }

    @Override
    public String toString() {
        return "Paquete [id_paquete=" + id_paquete + ", codigo_paquete=" + codigo_paquete + ", peso_kg=" + peso_kg
                + ", contiene_alimentos=" + contiene_alimentos + ", nivel_urgencia=" + nivel_urgencia + "]";
    }
    
}

