package Guia_Practica;

import Controlador.ControladorPrincipal;
import Modelo.Modelo_Camionero;
import Modelo.Modelo_Persona;
import Vista.VistaPrincipal;

public class Main {

    public static void main(String[] args) {

        VistaPrincipal vistaPrincipal = new VistaPrincipal();

        ControladorPrincipal control = new ControladorPrincipal(vistaPrincipal);
        control.iniciaControl();
        
        Modelo_Persona m = new Modelo_Persona();
        System.out.println("Codigo del main: " + m.traerCodigoDePersona());
    }
}
