package ec.edu.ups.clases;

import ec.edu.ups.enums.TipoDireccion;

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
    public Institucion(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
        this.asignacion = new ArrayList<>();
        this.sedes = new ArrayList<>();
    }
    public void addDireccion(TipoDireccion tipoDireccion,String callePrincipal, String calleSecundaria, String numeracion, String ciudad, String provincia, String pais){
        this.direccion = new Direccion(tipoDireccion, callePrincipal,calleSecundaria,numeracion,ciudad,provincia,pais);
    }

    public Institucion(int id, String nombre, List<String> sedes, List<Asignacion> asignacion) {
        this.id = id;
        this.nombre = nombre;
        this.sedes = sedes;
        this.asignacion = asignacion;
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
