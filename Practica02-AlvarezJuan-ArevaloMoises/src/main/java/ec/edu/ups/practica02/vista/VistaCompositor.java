/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica02.vista;

import ec.edu.ups.practica02.modelo.Compositor;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class VistaCompositor {

    private Scanner entrada;

    public VistaCompositor() {
        this.entrada = new Scanner(System.in);
    }

    public Compositor ingresarCompositor() {
        entrada = new Scanner(System.in);
        System.out.println("Ingrese el codigo del compositor: ");
        int codigo = entrada.nextInt();

        System.out.println("Ingrese el nombre del compositor: ");
        String nombre = entrada.next();

        System.out.println("Ingrese el apellido del compositor: ");
        String apellido = entrada.next();

        System.out.println("Ingrese la edad del compositor: ");
        int edad = entrada.nextInt();

        System.out.println("Ingrese la nacionalidad del compositor: ");
        String nacionalidad = entrada.next();

        System.out.println("Ingrese el salario del compositor: ");
        double salario = entrada.nextDouble();

        System.out.println("Ingrese el numero de composiciones del compositor");
        int numeroDeComposiciones = entrada.nextInt();

        return new Compositor(numeroDeComposiciones, codigo, nombre, apellido, edad, nacionalidad, salario);

    }
}
