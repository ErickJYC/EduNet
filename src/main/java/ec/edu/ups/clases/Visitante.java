package ec.edu.ups.clases;

import java.util.GregorianCalendar;

public class Visitante extends Persona{
    private String motivo;
    private GregorianCalendar fechaDeEntrada;
    private GregorianCalendar fechaDeSalida;

    public  Visitante(){}

    public Visitante(String motivo, GregorianCalendar fechaDeEntrada, GregorianCalendar fechaDeSalida) {
        this.motivo = motivo;
        this.fechaDeEntrada = fechaDeEntrada;
        this.fechaDeSalida = fechaDeSalida;
    }

    public Visitante(String nombre, String cedula, String apllido, String telefono, String correoelectronico, String motivo, GregorianCalendar fechaDeEntrada, GregorianCalendar fechaDeSalida) {
        super(nombre, cedula, apllido, telefono, correoelectronico);
        this.motivo = motivo;
        this.fechaDeEntrada = fechaDeEntrada;
        this.fechaDeSalida = fechaDeSalida;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public GregorianCalendar getFechaDeEntrada() {
        return fechaDeEntrada;
    }

    public void setFechaDeEntrada(GregorianCalendar fechaDeEntrada) {
        this.fechaDeEntrada = fechaDeEntrada;
    }

    public GregorianCalendar getFechaDeSalida() {
        return fechaDeSalida;
    }

    public void setFechaDeSalida(GregorianCalendar fechaDeSalida) {
        this.fechaDeSalida = fechaDeSalida;
    }

    @Override
    public String toString() {
        return "Visitante{" +
                "motivo='" + motivo + '\'' +
                ", fechaDeEntrada=" + fechaDeEntrada +
                ", fechaDeSalida=" + fechaDeSalida +
                '}';
    }
}
