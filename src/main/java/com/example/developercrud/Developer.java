package com.example.developercrud;


public class Developer {
    private int developerId;

    private String developerName;

    private String developerSkill;

    public Developer(int developerId, String developerName, String developerSkill) {
        this.developerId = developerId;
        this.developerName = developerName;
        this.developerSkill = developerSkill;
    }

    public int getDeveloperId() {
        return developerId;
    }

    public void setDeveloperId(int developerId) {
        this.developerId = developerId;
    }

    public String getDeveloperName() {
        return developerName;
    }

    public void setDeveloperName(String developerName) {
        this.developerName = developerName;
    }

    public String getDeveloperSkill() {
        return developerSkill;
    }

    public void setDeveloperSkill(String developerSkill) {
        this.developerSkill = developerSkill;
    }
}
