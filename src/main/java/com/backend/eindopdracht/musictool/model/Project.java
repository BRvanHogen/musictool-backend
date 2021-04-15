package com.backend.eindopdracht.musictool.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "projects")
public class Project {


    @Column
    private String name;
    @Column
    private String workingTitle;
    @Id
    @Column
    private Long id;

    public Project () {}
        public Project (String name, String workingTitle, long id) {
            this.name = name;
            this.workingTitle = workingTitle;
            this.id = id;
        }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWorkingTitle() {
        return workingTitle;
    }

    public void setWorkingTitle(String workingTitle) {
        this.workingTitle = workingTitle;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
