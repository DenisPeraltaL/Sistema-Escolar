/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;

/**
 *
 * @author ALEJANDRO
 */


import java.util.List;

public class Grupo {
    private int id;
    private String nombre;
    private int idProfesor;  
    private List<Materia> materias;  // Lista de materias asociadas

    public Grupo() {
    }

    public Grupo(String nombre, int idProfesor, List<Materia> materias) {
        this.nombre = nombre;
        this.idProfesor = idProfesor;
        this.materias = materias;
    }

    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getIdProfesor() { return idProfesor; }
    public void setIdProfesor(int idProfesor) { this.idProfesor = idProfesor; }

    public List<Materia> getMaterias() { return materias; }
    public void setMaterias(List<Materia> materias) { this.materias = materias; }
}