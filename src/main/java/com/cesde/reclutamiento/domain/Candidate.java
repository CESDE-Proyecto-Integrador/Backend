package com.cesde.reclutamiento.domain;

public class Candidate {
    private Integer id;
    private String fullName;
    private String email;
    private String role;
    private Integer experienceYears;

    // Constructor vacío
    public Candidate() {
    }

    // Constructor con todos los argumentos
    public Candidate(Integer id, String fullName, String email, String role, Integer experienceYears) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.role = role;
        this.experienceYears = experienceYears;
    }

    // Getters y Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Integer getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(Integer experienceYears) {
        this.experienceYears = experienceYears;
    }
}
