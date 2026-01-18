package com.mvith.KP.dto;

import com.mvith.KP.model.Organisation;
import com.mvith.KP.model.ProgramType;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class ProgramPatchRequest {
    private Integer age_min;
    private Integer age_max;
    private String name;
    private String description;
    @ManyToOne
    @JoinColumn(name = "type_id")
    private ProgramType type_id;  

    @ManyToOne
    @JoinColumn(name = "org_id")
    private Organisation org_id; 

    public Integer getAge_Min() {
        return age_min;
    }

    public void setAge_max(Integer age) {
        this.age_max = age;
    }

    public Integer getAge_Max() {
        return age_max;
    }

    public void setAge_min(Integer age) {
        this.age_min = age;
    }

    public String getName() {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ProgramType getTypeID() {
        return type_id;
    }

    public void setTypeID(ProgramType type_id) {
        this.type_id = type_id;
    }

    public Organisation getOrgID() {
        return org_id;
    }

    public void setOrg_id(Organisation org_id) {
        this.org_id = org_id;
    }
}
