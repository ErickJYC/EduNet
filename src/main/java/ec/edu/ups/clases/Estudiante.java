package ec.edu.ups.clases;

public class Estudiante extends Persona{
    private String carrera;

    public Estudiante(){}

    public Estudiante(String carrera) {
        this.carrera = carrera;
    }

    public Estudiante(String nombre, String cedula, String apllido, String telefono, String correoelectronico, String carrera) {
        super(nombre, cedula, apllido, telefono, correoelectronico);
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
        return "Estudiante{" +
                "carrera='" + carrera + '\'' +
                '}';
    }
}
