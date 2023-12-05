package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.List;
//right click getters and setters, rather than menu, easier(?)
@Entity
public class Skill extends AbstractEntity {

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }

    @ManyToMany(mappedBy = "skills")
    public List<Job> jobs;
    public Skill() {

    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    @Size(min = 0, max = 1000)
    public String description;
}
