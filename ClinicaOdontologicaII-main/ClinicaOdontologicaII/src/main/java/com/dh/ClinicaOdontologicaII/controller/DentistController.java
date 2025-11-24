package com.dh.ClinicaOdontologicaII.controller;

import com.dh.ClinicaOdontologicaII.entities.Dentist;
import com.dh.ClinicaOdontologicaII.service.DentistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/dentist")
public class DentistController {

    private final DentistService dentistService;

    @Autowired  //INYECCION DE DEPENDENCIA
    public DentistController(DentistService dentistService) {
        this.dentistService = dentistService;
    }

    //CARGAR UN DENTISTA
    @PostMapping
    public Dentist save(@RequestBody Dentist dentist){
        return dentistService.save(dentist);
    }

    //CONSULTAR LA LISTA COMPLETA
    @GetMapping
    public List<Dentist> findAll(){
        return dentistService.findAll();
    }

    //BUSCAR POR ID
    @GetMapping("/id/{id}")
    public ResponseEntity<Dentist> findById(@PathVariable Integer id){
        Optional<Dentist> dentistWanted = dentistService.findById(id);
        if (dentistWanted.isPresent()){
            return ResponseEntity.ok(dentistWanted.get());
        } else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    //ACTUALIZAR UN DENTISTA
    @PutMapping
    public Dentist update(@RequestBody Dentist dentist){
        Optional<Dentist> optionalDentist = dentistService.findById(dentist.getId());
        if (optionalDentist.isPresent()){
            dentistService.update(dentist);
            return dentist;
        } else{
            return dentist;
        }
    }

    //BORRAR UN DENTISTA
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Integer id){
        Optional<Dentist> optionalDentist = dentistService.findById(id);
        if(optionalDentist.isPresent()){
            dentistService.delete(id);
        //if (dentistService.findById(id).isPresent()){
        //dentistService.delete(id);
            return "Se eliminó el odontologo con id: " + id;
        } else{
            return "No se encontró el dontologo con id: " + id;
        }
    }

}
