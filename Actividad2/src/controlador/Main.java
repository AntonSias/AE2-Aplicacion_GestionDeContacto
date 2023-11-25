package controlador;

import vista.VentanaPrincipal;
import vista.NewContac;

public class Main {


    public static void main(String[] args) {
        // Crear la ventana principal
        VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();

        // Crear el manejador de eventos para la ventana principal
        ManejadorEventos manejadorEventos = new ManejadorEventos(ventanaPrincipal);

        // Crear la ventana de contacto 
        NewContac ventanaContacto = new NewContac();

        // Crear el manejador de eventos para la ventana de contacto
        ManejadorEAdd manejadorEAdd = new ManejadorEAdd(ventanaPrincipal, ventanaContacto);

        // Establecer el manejador en la ventana principal
        ventanaPrincipal.establecerManejador(manejadorEventos);

        // Establecer el manejador en la ventana de contacto
        ventanaContacto.establecerListeners(manejadorEAdd);

    }
}
