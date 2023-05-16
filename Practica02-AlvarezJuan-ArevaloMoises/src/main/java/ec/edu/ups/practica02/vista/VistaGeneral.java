/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica02.vista;

import ec.edu.ups.practica02.controlador.ControladorPersona;
import ec.edu.ups.practica02.modelo.Cantante;
import ec.edu.ups.practica02.modelo.Compositor;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class VistaGeneral {

    private Scanner entrada;

    public VistaGeneral() {

        this.entrada = new Scanner(System.in);

        System.out.println("Que desea hacer: ");
        System.out.println("1.Ingreso de cantante: ");
        System.out.println("2.Ingreso de compositor: ");
        System.out.println("3.Agregar clientes");
        System.out.println("4.Imprimir persona");
        System.out.println("5.Buscar cantante por nombre de disco: ");
        System.out.println("6.Buscar compositor por nombre de cancion: ");
        System.out.println("7.Salir");

        int opcion = entrada.nextInt();

        switch (opcion) {
            case 1:
                VistaCantante vistaCantante = new VistaCantante();
                vistaCantante.ingresarCantante();

            case 2:
                VistaCompositor vistaCompositor = new VistaCompositor();
                vistaCompositor.ingresarCompositor();

            case 3:
                Cantante vistaCantante1 = new Cantante();
                Compositor compositor = new Compositor();
                compositor.agregarCliente(vistaCantante1);

            case 4:
                ControladorPersona controladorPersona = new ControladorPersona();
                controladorPersona.list();

            case 5:
                System.out.println("Ingrese el titulo del disco a buscar: ");
                Scanner entrada1 = new Scanner(System.in);
                String tituloDisco = entrada1.next();
                Compositor compositor1 = new Compositor();
                compositor1.buscarNombreDeCancion(tituloDisco);

            case 6:
                System.out.println("Ingrese el nombre de la cancion a buscar: ");
                Scanner entrada2 = new Scanner(System.in);
                String tituloCancion = entrada2.next();
                Cantante cantante = new Cantante();
                cantante.buscarNombreDeCancion(tituloCancion);

                break;
            default:
                System.out.println("Debes ingresar un numero del 1 al 7.");
        }

    }

}
