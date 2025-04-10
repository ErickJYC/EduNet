package Principal;

import ec.edu.ups.clases.*;
import ec.edu.ups.enums.Rol;
import ec.edu.ups.enums.TipoDireccion;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class Principal {
    public static void main(String[] args) {

        //Estudiante
        Estudiante estudiante = new Estudiante("Jose","Torres","050505","0987878787","josesito12@gmail.com","computacion");
        Direccion direccionEst = new Direccion(TipoDireccion.CASA,"calle","vieja","155","cuenca","Azuay","Ecuador");
        estudiante.addDireccion(direccionEst);


        //Docente
        List<String> titulos = new ArrayList<>();
        titulos.add("Ingeniero");
        titulos.add("Arquitect");
        List<String> areas = new ArrayList<>();
        areas.add("Computacion");
        areas.add("Calculo");

        Docente docente = new Docente("Jaime","Yunga","0105005","051811818","Jaimito12213@gmail.com",titulos,areas);
        Direccion direcciondoc = new Direccion(TipoDireccion.CASA,"Puerto","Palos","ND","Cuenca","Azuay","Ecuador");
        docente.addDireccion(direcciondoc);

        //Administrativo
        Direccion direccionvis = new Direccion(TipoDireccion.CASA,"San jose","Balsai","ND","Cuenca","Azuay","Ecuador");
        List<String> cargos = new ArrayList<>();
        cargos.add("Secretaria");
        cargos.add("Tesorero");
        List<String> resposabilidad = new ArrayList<>();
        resposabilidad.add("Anotar");
        resposabilidad.add("Revisar");
        Administrativo administrativo = new Administrativo("Gabriela","Chillogalli","0515105","0978878","gaby12@gamil.com",cargos,resposabilidad);
        administrativo.addDireccion(direccionvis);



        //Visitante
        GregorianCalendar entrada = new GregorianCalendar(2025,4,10,9,30);
        GregorianCalendar salida = new GregorianCalendar(2025,4,10,10,30);

        Visitante visitante = new Visitante("Cecilia","Chimbo","050505","097878787","cecila12@gmail.com","Visita",entrada,salida);

        // Institucion
        GregorianCalendar inico = new GregorianCalendar(2025,03,17);
        Asignacion asignacion1 = new Asignacion(estudiante,inico, Rol.ESTUDIANTE);
        Asignacion asignacion2 = new Asignacion(docente,inico,Rol.DOCENTE);

        Institucion institucion1 = new Institucion("Institucion 1",1);
        institucion1.addDireccion(TipoDireccion.INSTITUCION,"calle","vieja","154","cuenca","Azuay","Ecuador");
        institucion1.addAsignacion(asignacion1);
        List<String> sedes = new ArrayList<>();
        sedes.add("Sede1");
        sedes.add("Sede2");
        institucion1.setSedes(sedes);


        Institucion institucion2 = new Institucion("Institucion 2",2);
        institucion2.addDireccion(TipoDireccion.TRABAJO,"loja","mexico","ND","Cuenca","Azuay","Ecuador");
        institucion2.addAsignacion(asignacion2);
        institucion2.setSedes(sedes);


        System.out.println("Mostrar Institucion 1: " + institucion1);
        System.out.println("Mostrar Instirucion 2: " + institucion2);
        System.out.println("Mostrar Estudiante: " + estudiante);
        System.out.println("Mostrar Docente: " + docente);
        System.out.println("Mostrar Administrativo: " + administrativo);
        System.out.println("Mostrar Visitante: "+ visitante);

    }
}
