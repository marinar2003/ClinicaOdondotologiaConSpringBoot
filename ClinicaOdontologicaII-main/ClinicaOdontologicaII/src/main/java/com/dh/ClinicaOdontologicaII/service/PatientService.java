package com.dh.ClinicaOdontologicaII.service;

import com.dh.ClinicaOdontologicaII.entities.Patient;
import com.dh.ClinicaOdontologicaII.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatientService {

    private PatientRepository repository;

    @Autowired //Inyeccion de dependencia
    public PatientService(PatientRepository repository) {
        this.repository = repository;
    }

    //GUARDAR UN PACIENTE
    public Patient save (Patient patient){
        return repository.save(patient);
    }

    //BUSCAR POR ID
    public Optional<Patient> findById(Integer id){
        return repository.findById(id);
    }

    //ACTUALIZAR UN PACIENTE
    public void update(Patient patient){
         repository.save(patient);
    }

    //BORRAR UN PACIENTE
    public void delete(Integer id){
        repository.deleteById(id);
    }

    //AGREGAR
    public List<Patient> findAll(){
        return repository.findAll();
    }

    //AGREGAR CONSULTA HQL
    public Optional<Patient> findByLastName(String lastName){
        return repository.findByLastName(lastName);
    }

    public Optional<Patient> findByName(String name){
        return repository.findByName(name);
    }

}
