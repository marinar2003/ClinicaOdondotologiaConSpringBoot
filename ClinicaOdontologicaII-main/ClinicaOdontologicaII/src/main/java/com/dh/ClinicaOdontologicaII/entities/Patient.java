package com.dh.ClinicaOdontologicaII.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity //Crear una tabla
@Table(name = "Paciente") //Nombre de la tabla
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Generacion del Id en forma incremental
    @Column(name="ID Paciente")
    private Integer id;

    @Column(name="Nombre")
    private String name;

    @Column(name="Apellido")
    private String lastName;

    @Column(name="DNI")
    private String cardIdentity;

    @Column(name="Fecha_Admision")
    private LocalDate admission;

    public Patient() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCardIdentity() {
        return cardIdentity;
    }

    public void setCardIdentity(String cardIdentity) {
        this.cardIdentity = cardIdentity;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getAdmission() {
        return admission;
    }

    public void setAdmission(LocalDate admission) {
        this.admission = admission;
    }
}
