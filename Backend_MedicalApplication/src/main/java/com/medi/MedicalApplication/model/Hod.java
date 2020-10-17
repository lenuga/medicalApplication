package com.medi.MedicalApplication.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name="hod")
public class Hod {

    @Id
    private String hodId;
    private String title;
    private String hodName;
    private int tpNo;
    private String mail;
    private String departmentId;


}
