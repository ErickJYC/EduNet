package ec.edu.ups.clases;

import java.util.ArrayList;
import java.util.List;

public class Docente extends Persona{
    private List<String> titulosAcademicos;
    private List<String> areaDeEspecializacion;

    public Docente(){
        this.titulosAcademicos = new ArrayList<>();
        this.areaDeEspecializacion = new ArrayList<>();
    }
    public Docente(String nombre, String apellido, String cedula, String telefono, String correoelectronico, List<String> titulosAcademicos,List<String> areaDeEspecializacion) {
        super(nombre, apellido, cedula, telefono, correoelectronico);
        this.titulosAcademicos = titulosAcademicos;
        this.areaDeEspecializacion = areaDeEspecializacion;


    }

    public List<String> getTitulosAcademicos() {
        return titulosAcademicos;
    }

    public void setTitulosAcademicos(List<String> titulosAcademicos) {
        this.titulosAcademicos = titulosAcademicos;
    }

    public List<String> getAreaDeEspecializacion() {
        return areaDeEspecializacion;
    }

    public void setAreaDeEspecializacion(List<String> areaDeEspecializacion) {
        this.areaDeEspecializacion = areaDeEspecializacion;
    }

    @Override
    public String toString() {
        return
                super.toString()+
                "titulosAcademicos=" + titulosAcademicos +
                ", areaDeEspecializacion=" + areaDeEspecializacion ;
    }
}
