package ec.edu.ups.clases;

import java.util.ArrayList;
import java.util.List;

public class Persona {
    private String nombre;
    private String cedula;
    private String apllido;
    private String telefono;
    private String correoelectronico;
    private List <Direccion> direcciones;

    public  Persona(){
        this.direcciones = new ArrayList<>();
    }

    public Persona(String nombre, String cedula, String apllido, String telefono, String correoelectronico) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.apllido = apllido;
        this.telefono = telefono;
        this.correoelectronico = correoelectronico;
        this.direcciones = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getApllido() {
        return apllido;
    }

    public void setApllido(String apllido) {
        this.apllido = apllido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoelectronico() {
        return correoelectronico;
    }

    public void setCorreoelectronico(String correoelectronico) {
        this.correoelectronico = correoelectronico;
    }
    public void addDireccion(Direccion direccion){
        direcciones.add(direccion);
    }
    public List<Direccion> getDirecciones(){
        return direcciones;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", cedula='" + cedula + '\'' +
                ", apllido='" + apllido + '\'' +
                ", telefono='" + telefono + '\'' +
                ", correoelectronico='" + correoelectronico + '\'' +
                ", direcciones=" + direcciones +
                '}';
    }
}
