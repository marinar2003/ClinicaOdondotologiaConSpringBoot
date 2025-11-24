package com.dh.ClinicaOdontologicaII.service;

import com.dh.ClinicaOdontologicaII.entities.Dentist;
import com.dh.ClinicaOdontologicaII.repository.DentistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service //Agregar para que lo identifique como un bin
public class DentistService {

    //Inyectamos el repositorio
    private DentistRepository repository;

    @Autowired //inyeccion de dependencia
    public DentistService(DentistRepository repository) {
        this.repository = repository;
    }

    //Guardar un dentista
    public Dentist save(Dentist dentist){
        return repository.save(dentist);
    }

    //Buscar por ID
    public Optional<Dentist> findById(Integer id){
        return repository.findById(id);
    }

    public void update(Dentist dentist){
        repository.save(dentist);
    }

    public void delete(Integer id){
        repository.deleteById(id);
    }

    public List<Dentist> findAll(){
        return repository.findAll();
    }


}
