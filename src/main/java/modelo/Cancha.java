/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class Cancha {
    private int id;
    private String nombre;
    private String deporte;
    private int capacidad;

    public Cancha(String nombre, String deporte, int capacidad) {
        this.nombre = nombre;
        this.deporte = deporte;
        this.capacidad = capacidad;
    }
    //Constructor con id para editar
    public Cancha(int id, String nombre, String deporte, int capacidad) {
        this.id = id;
        this.nombre = nombre;
        this.deporte = deporte;
        this.capacidad = capacidad;
    }

    public int getId() {
        return id;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getDeporte() {
        return deporte;
    }

    public int getCapacidad() {
        return capacidad;
    }
}
