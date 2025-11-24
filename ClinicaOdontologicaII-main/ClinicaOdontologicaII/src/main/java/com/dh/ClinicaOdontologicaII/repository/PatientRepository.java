package com.dh.ClinicaOdontologicaII.repository;

import com.dh.ClinicaOdontologicaII.entities.Patient;
import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //permite reconocer a la clase como un repositorio, la clase que interactua directamente con la BD
public interface PatientRepository extends JpaRepository<Patient, Integer> {
}
