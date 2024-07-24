package org.flexe.repositories;

import org.flexe.hospital.entities.Patient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.UUID;

@Repository
public interface PatientRepository extends JpaRepository<Patient, UUID> {
    Patient findByName(String name);


    @Transactional
    @Query("Select p from Patient p ")
    Page<Patient> getAllPatients(Pageable pageable);

    Page<Patient> findByBirthday(Date birthday, Pageable pageable);
}
