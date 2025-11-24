package com.dh.ClinicaOdontologicaII.controller;

import com.dh.ClinicaOdontologicaII.entities.Dentist;
import com.dh.ClinicaOdontologicaII.entities.Patient;
import com.dh.ClinicaOdontologicaII.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/patient")
public class PatientController {

    private final PatientService patientService;

    @Autowired
    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    //CARGAR UN PACIENTE
    @PostMapping
    public Patient save(@RequestBody Patient patient){
        return patientService.save(patient);
    }

    //CONSULTAR TODOS LOS PACIENTES
    @GetMapping
    public List<Patient> findAll(){
        return patientService.findAll();
    }

    //BUSCAR AL PACIENTE POR ID
    @GetMapping("id/{id}")
    public ResponseEntity<Patient> findById(@PathVariable Integer id){
        Optional<Patient> patientWanted = patientService.findById(id);
        if(patientWanted.isPresent()){
            return ResponseEntity.ok(patientWanted.get());
        } else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    //ACTUALIZAR PACIENTE
    @PutMapping
    public Patient update(@RequestBody Patient patient){
        Optional<Patient> optionalPatient = patientService.findById(patient.getId());
        if(optionalPatient.isPresent()){
            patientService.update(patient);
            return patient;
        } else{
            return patient;
        }
    }

    //BORRAR UN PACIENTE
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Integer id){
        Optional<Patient> optionalPatient = patientService.findById(id);
        if(optionalPatient.isPresent()){
            patientService.delete(id);
            //if (dentistService.findById(id).isPresent()){
            //dentistService.delete(id);
            return "Se eliminó el paciente con id: " + id;
        } else{
            return "No se encontró el paciente con id: " + id;
        }
    }
}
