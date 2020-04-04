package CIS3368.Exam2.Main.Models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="virus")


public class Virus {

    @Id
    @Column(name = "ID")
    private String id;
    @Column(name = "Name")
    private String name;
    @Column(name = "Description")
    private String description;
    @Column(name = "Symptoms")
    private String symptoms;
    @Column(name = "Duration")
    private String duration;
    @Column(name = "mortality_rate")
    private String mortalityrate;

    //default constructor
    public Virus(){}


    // passing values into the virus object: name, description,symptoms,duration and rate
    public Virus(String id,String name, String description, String symptoms, String duration, String mortalityrate){
        this.id = id;
        this.name = name;
        this.description = description;
        this.symptoms = symptoms;
        this.duration = duration;
        this.mortalityrate = mortalityrate;
    }


    //getter and setter

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getMortalityrate() {
        return mortalityrate;
    }

    public void setMortalityrate(String mortalityrate) {
        this.mortalityrate = mortalityrate;
    }
}
