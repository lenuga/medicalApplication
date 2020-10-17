package com.medi.MedicalApplication.service;

import com.medi.MedicalApplication.model.Medical;
import com.medi.MedicalApplication.repository.MedicalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicalService {
    @Autowired
    private MedicalRepository repository;
    //Post
    public Medical saveMedical(Medical medical){ return repository.save(medical);}
    //save all
    public List<Medical> saveMedicals(List<Medical> medicals){
        return repository.saveAll(medicals);
    }
    public List<Medical> getMedicals(){
        return repository.findAll();
    }
    public  Medical getMedicalByMedicalId(Long medicalId){
        return repository.findByMedicalId(medicalId);
    }
    public Medical getMedicalByAttendance(Long attendance){ return repository.findByAttendance(attendance); }
    public String deleteMedical(String medicalId) {
        repository.deleteByMedicalId(medicalId);
        return "medical removed!! "+ medicalId;
    }
    public Medical updateMedical(Medical medical)
    {
        //Medical exisitingMedicalMedical = repository.findByMedicalId(medical.getMedicalId());
       /* exisitingMedical.setFirstName(medical.getFirstName());
        exisitingMedical.setAddress(medical.getAddress());
        exisitingMedical.setCourseId(medical.getCourseId());*/
        Medical exisitingMedical = new Medical();
        return repository.save(exisitingMedical);

    }

}
