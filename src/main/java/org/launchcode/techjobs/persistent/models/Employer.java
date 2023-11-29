package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {
    public Employer(){

    }
    //step 1, part 3
    //OneToMany lesson @ https://education.launchcode.org/java-web-dev-curriculum/orm-relationships/reading/one-to-many/index.html
    //JoinColumn documentation @ https://jakarta.ee/specifications/persistence/2.2/apidocs/javax/persistence/joincolumn
    @OneToMany()
    @JoinColumn(name="employer_id")
    private List<Job> jobs = new ArrayList<>();

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    @NotNull
    @Size(min = 0, max = 100)
    public String location;
}
