package ec.edu.ups.clases;

import java.util.ArrayList;
import java.util.List;

public class Administrativo extends Persona{
    private List<String> cargos;
    private List<String> responsabilidades;

    public Administrativo (){
         this.cargos = new ArrayList<>();
         this.responsabilidades = new ArrayList<>();
     }

    public Administrativo(String nombre, String apellido, String cedula, String telefono, String correoelectronico,List<String> cargos,List<String> responsabilidades) {
        super(nombre, apellido, cedula, telefono, correoelectronico);
        this.responsabilidades = responsabilidades;
        this.cargos = cargos;
    }

    public List<String> getCargos() {
        return cargos;
    }

    public void setCargos(List<String> cargos) {
        this.cargos = cargos;
    }

    public List<String> getResponsabilidades() {
        return responsabilidades;
    }

    public void setResponsabilidades(List<String> responsabilidades) {
        this.responsabilidades = responsabilidades;
    }

    @Override
    public String toString() {
        return
                super.toString() +
                "cargos=" + cargos +
                ", responsabilidades=" + responsabilidades ;
    }
}
