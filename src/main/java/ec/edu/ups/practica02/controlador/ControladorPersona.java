/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica02.controlador;

import ec.edu.ups.practica02.modelo.Persona;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class ControladorPersona implements IControlador {

    //Atributos
    private List<Persona> personas;

    public ControladorPersona() {
        this.personas = new ArrayList<>();
    }

    @Override
    public void create(Object obj) {
        if (obj instanceof Persona) {
            personas.add((Persona) obj);
        }
    }

    @Override
    public Object read(Object obj) {
        if (obj instanceof String) {
            String nombre = (String) obj;
            for (Persona persona : personas) {
                if (persona.getNombre().equals(nombre)) {
                    return persona;
                }
            }
        }

        return null;
    }

    @Override
    public void update(Object obj) {
        if (obj instanceof Persona) {
            String nombre = ((Persona) obj).getNombre();
            for (int i = 0; i < personas.size(); i++) {
                Persona persona = personas.get(i);
                if (persona.getNombre().equals(nombre)) {
                    personas.set(i, (Persona) obj);
                    break;
                }
            }

        }
    }

    @Override
    public void delete(Object obj) {
        if (obj instanceof Persona) {
            for (int i = 0; i < personas.size(); i++) {
                Persona persona = personas.get(i);
                if (persona.equals((Persona) obj)) {
                    personas.remove(i);
                    break;
                }
            }

        }
    }

    @Override
    public void list() {
        for (Persona persona : personas) {
            System.out.println(persona.toString());
        }
    }

}
