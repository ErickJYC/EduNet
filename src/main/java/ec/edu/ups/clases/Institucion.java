package ec.edu.ups.clases;

import java.util.ArrayList;
import java.util.List;

public class Institucion {
    private int id;
    private String nombre;
    private List<String> sedes;
    private Direccion direccion;
    private List<Asignacion> asignacion;

    public Institucion (){
        this.asignacion = new ArrayList<>();
        this.sedes = new ArrayList<>();
    }
    public Institucion(String nombre, int id, Direccion direccion) {
        this.nombre = nombre;
        this.id = id;
        this.direccion = direccion;
        this.asignacion = new ArrayList<>();
        this.sedes = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<String> getSedes() {
        return sedes;
    }

    public void setSedes(List<String> sedes) {
        this.sedes = sedes;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public List<Asignacion> getAsignacion() {
        return asignacion;
    }

    public void setAsignacion(List<Asignacion> asignacion) {
        this.asignacion = asignacion;
    }

    @Override
    public String toString() {
        return "Institucion{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", sedes=" + sedes +
                ", direccion=" + direccion +
                ", asignacion=" + asignacion +
                '}';
    }
}
