package ec.edu.ups.clases;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Visitante extends Persona{
    private String motivo;
    private GregorianCalendar fechaDeEntrada;
    private GregorianCalendar fechaDeSalida;

    public  Visitante(){}

    public Visitante(String nombre, String apellido, String cedula, String telefono, String correoelectronico, String motivo, GregorianCalendar fechaDeEntrada, GregorianCalendar fechaDeSalida) {
        super(nombre, apellido, cedula, telefono, correoelectronico);
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
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        return
                super.toString() +
                "motivo='" + motivo + '\'' +
                ", fechaDeEntrada=" + dateFormat.format(fechaDeEntrada.getTime()) +
                ", fechaDeSalida=" + dateFormat.format(fechaDeSalida.getTime());
    }
}
