package ec.edu.ups.clases;

public class Estudiante extends Persona{
    private String carrera;

    public Estudiante(){}

    public Estudiante(String nombre, String apellido, String cedula, String telefono, String correoelectronico, String carrera) {
        super(nombre, apellido, cedula, telefono, correoelectronico);
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return
                super.toString()+
                "carrera='" + carrera + '\'';
    }
}
