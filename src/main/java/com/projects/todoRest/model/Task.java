package com.projects.todoRest.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(length = 50)
    private String title;
    @Column(length = 150)
    private String description;
    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate = new Date();
    @Column
    private boolean deleted = false;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }
    public void setAll(Task task){
        this.title = task.getTitle();
        this.description = task.getDescription();
        this.creationDate = task.getCreationDate();
        this.deleted = task.isDeleted();
    }
}
