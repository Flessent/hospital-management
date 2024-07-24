package org.flexe.restcontrollers;


import org.flexe.hospital.entities.Patient;
import org.flexe.repositories.PatientRepository;
import org.flexe.services.interfaces.PatientServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/patient")
public class PatientRestController extends  RuntimeException {

@Autowired
    private PatientServices patientServices;



@GetMapping(path  = "/getAllPatient")
public Page<Patient> getAllPatient(){

    return this.patientServices.getAllPatients(1,2);//this.patientServices.getListPatient().size());

}


}
