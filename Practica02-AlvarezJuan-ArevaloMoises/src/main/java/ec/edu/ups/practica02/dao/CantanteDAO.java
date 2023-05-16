/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica02.dao;

import ec.edu.ups.practica02.idao.IControlador;
import ec.edu.ups.practica02.modelo.Persona;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class CantanteDAO implements IControlador {

    //Atributos
    private List<Persona> personas;

    public CantanteDAO() {
        this.personas = new ArrayList<>();
    }

    @Override
    public void create(Persona obj) {
        if (obj instanceof Persona) {
            personas.add((Persona) obj);
        }
    }

    @Override
    public Persona read(Persona obj) {
        if (obj instanceof Persona) {
            Persona personaLectura = (Persona) obj;
            for (Persona persona : personas) {
                if (persona.getCodigo() == (personaLectura.getCodigo())) {
                    return persona;
                }
            }
        }

        return null;
    }

    @Override
    public void update(Persona obj) {
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
    public void delete(Persona obj) {
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
