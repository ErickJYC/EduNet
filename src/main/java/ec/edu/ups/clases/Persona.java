package ec.edu.ups.clases;

import java.util.ArrayList;
import java.util.List;

public class Persona {
    private String nombre;
    private String apellido;
    private String cedula;
    private String telefono;
    private String correoelectronico;
    private List <Direccion> direcciones;

    public  Persona(){
        this.direcciones = new ArrayList<>();
    }

    public Persona(String nombre, String apellido, String cedula, String telefono, String correoelectronico) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
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
        return apellido;
    }

    public void setApllido(String apllido) {
        this.apellido = apllido;
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
        return
                "nombre='" + nombre + '\'' +
                        ", apllido='" + apellido + '\'' +
                        ", cedula='" + cedula + '\'' +
                ", telefono='" + telefono + '\'' +
                ", correoelectronico='" + correoelectronico + '\'' +
                ", direcciones=" + direcciones +
                '}';
    }
}
