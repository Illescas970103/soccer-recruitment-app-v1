package com.example.springboot.model.Player;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


import com.fasterxml.jackson.annotation.JsonTypeId;

import java.time.LocalDate;
@Entity
public class Player {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    String name;
    String Position;
    private LocalDate dob;
    int age;
    private String email;
    private String team;
    private String Nationality;
    int weight ;
    private LocalDate debut;

    public Player(){}

    public Player(Long id, String name, String position, LocalDate dob, int age, String email, String team, String nationality, int weight, LocalDate debut) {
        this.id = id;
        this.name = name;
        Position = position;
        this.dob = dob;
        this.age = age;
        this.email = email;
        this.team = team;
        Nationality = nationality;
        this.weight = weight;
        this.debut = debut;
    }

    public String getName(){
        return this.name;
    }

    public String getPosition() {
        return Position;
    }

    public LocalDate getDob() {
        return dob;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }

    public String getNationality() {
        return Nationality;
    }

    public int getWeight() {
        return weight;
    }

    public LocalDate getDebut() {
        return debut;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        Position = position;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public void setNationality(String nationality) {
        Nationality = nationality;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setDebut(LocalDate debut) {
        this.debut = debut;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Player{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", Position='").append(Position).append('\'');
        sb.append(", dob=").append(dob);
        sb.append(", age=").append(age);
        sb.append(", email='").append(email).append('\'');
        sb.append(", team='").append(team).append('\'');
        sb.append(", Nationality='").append(Nationality).append('\'');
        sb.append(", weight=").append(weight);
        sb.append(", debut=").append(debut);
        sb.append('}');
        return sb.toString();
    }
}
