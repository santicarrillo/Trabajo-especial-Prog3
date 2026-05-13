package main;

public class Camion {
    private int id_camion;
    private String patente;
    private Boolean esta_refrigerado;
    private double capacidad_kg;
    //<camiones totales>

    public Camion(int id_camion, String patente, Boolean esta_refrigerado, double capacidad_kg) {
        this.id_camion = id_camion;
        this.patente = patente;
        this.esta_refrigerado = esta_refrigerado;
        this.capacidad_kg = capacidad_kg;
    }

    public int getId_camion() {
        return id_camion;
    }

    public void setId_camion(int id_camion) {
        this.id_camion = id_camion;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public Boolean getEsta_refrigerado() {
        return esta_refrigerado;
    }

    public void setEsta_refrigerado(Boolean esta_refrigerado) {
        this.esta_refrigerado = esta_refrigerado;
    }

    public double getCapacidad_kg() {
        return capacidad_kg;
    }

    public void setCapacidad_kg(double capacidad_kg) {
        this.capacidad_kg = capacidad_kg;
    }

        
    

    @Override
    public String toString() {
        return "\nCamion [id_camion=" + id_camion + ", patente=" + patente + ", esta_refrigerado="
                + esta_refrigerado + ", capacidad_kg=" + capacidad_kg + "]";
    }

}


