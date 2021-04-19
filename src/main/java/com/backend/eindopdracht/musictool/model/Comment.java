package com.backend.eindopdracht.musictool.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "comments")
public class Comment {


    @Id
    @Column
    private Long id;
    @Column
    private String textareaInput;
    @Column
    private String byUser;
    @Column
    private Date date;

    public Comment() {
    }

    public Comment(Long id, String textareaInput, String byUser, Date date) {
        this.id = id;
        this.textareaInput = textareaInput;
        this.byUser = byUser;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTextareaInput() {
        return textareaInput;
    }

    public void setTextareaInput(String textareaInput) {
        this.textareaInput = textareaInput;
    }

    public String getByUser() {
        return byUser;
    }

    public void setByUser(String byUser) {
        this.byUser = byUser;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
