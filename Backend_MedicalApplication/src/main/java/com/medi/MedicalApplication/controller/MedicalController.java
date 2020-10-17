package com.medi.MedicalApplication.controller;

import com.medi.MedicalApplication.model.Medical;
import com.medi.MedicalApplication.service.MedicalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/medical")
public class MedicalController {
    @Autowired
    private MedicalService service;

    @PostMapping("/addmedical")
    public Medical addMedical (@RequestBody Medical medical) { return service.saveMedical(medical); }
    @PostMapping("/addMedicals")
    public List<Medical> addMedicals(@RequestBody List<Medical > medicals) {
        return service.saveMedicals(medicals);
    }
    @GetMapping("/medicals")
    public List<Medical> findAllMedicals(){ return service.getMedicals(); }
    @GetMapping("/medicalById/{id}")
    public Medical  findByMedicalId(@PathVariable(value="id") Long medicalId) {return service.getMedicalByMedicalId(medicalId);}
   // @GetMapping("/medical/{name}")
   // public Medical  findByAttendance(@PathVariable(value = "name") Long attendance) {return service.getMedicalByAttendance(attendance); }
    @PutMapping("/update")
    public Medical  updateMedical(@RequestBody Medical  medical){
        return service.updateMedical(medical);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteMedical(@PathVariable String id) {
        return service.deleteMedical(id);
    }
}
