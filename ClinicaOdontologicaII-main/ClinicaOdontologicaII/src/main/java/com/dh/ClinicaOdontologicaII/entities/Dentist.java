package com.dh.ClinicaOdontologicaII.entities;

import jakarta.persistence.*;

@Entity //Mapear la clase en un a tabla
@Table(name = "Dentists") //Nombre de la tabla
public class Dentist {

    @Id //ID como primary Kay
    @GeneratedValue (strategy = GenerationType.IDENTITY) // Generacion del ID en forma incremental
    @Column(name ="ID Dentista")
    private Integer id;

    @Column(name = "Matricula")
    private Integer matricula;

    @Column(name = "Nombre", nullable = false)
    private String nombre;

    @Column(name="Apellido", nullable = false)
    private String apellido;

    public Dentist() {

    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
