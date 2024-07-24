package org.flexe.services.interfaces;

import org.flexe.hospital.entities.Patient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Date;
import java.util.List;

public interface PatientServices{
    Patient findByName(String name);

    Page<Patient> getAllPatients(int pageNum, int pageSize);
    Page<Patient> findPatientByBirthday(Date birthday,int pageNum, int pageSize);
    Patient savePatient(Patient patient);
    List<Patient> getListPatient();


}
