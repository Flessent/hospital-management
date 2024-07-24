package org.flexe.services.implementation;

import org.flexe.hospital.entities.Patient;
import org.flexe.repositories.PatientRepository;
import org.flexe.services.interfaces.PatientServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
@Transactional
public class PatientServiceImp implements PatientServices {


    //@Autowired
    private PatientRepository patientRepository;
    public PatientServiceImp(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }
    @Override
    public Patient findByName(String name) {
        return this.patientRepository.findByName(name) ;
    }

    @Override
    public Page<Patient> getAllPatients(int pageNum, int pageSize) {
        return this.patientRepository.getAllPatients(PageRequest.of(pageNum,pageSize));
    }

    @Override
    public Page<Patient> findPatientByBirthday(Date birthday, int pageNum, int pageSize) {
        return this.patientRepository.findByBirthday(birthday, PageRequest.of(pageNum, pageSize));
    }

    @Override
    public Patient savePatient(Patient patient) {
        return this.patientRepository.save(patient);
    }

    @Override
    public List<Patient> getListPatient() {
        return this.patientRepository.findAll();
    }
}
