package com.example.projetofinaldio.diagram.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String city;
    private String state;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<InstrumentSkill> instrumentSkills;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<OwnedInstrument> ownedInstruments;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public List<InstrumentSkill> getInstrumentSkills() {
        return instrumentSkills;
    }
    public void setInstrumentSkills(List<InstrumentSkill> instrumentSkills) {
        this.instrumentSkills = instrumentSkills;
    }
    public List<OwnedInstrument> getOwnedInstruments() {
        return ownedInstruments;
    }
    public void setOwnedInstruments(List<OwnedInstrument> ownedInstruments) {
        this.ownedInstruments = ownedInstruments;
    }
    
}
