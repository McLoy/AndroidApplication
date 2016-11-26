package com.example.user.myawesomeapplication;

public class Task {

    public static final String COLLECTION_NAME = "tasks";
    private String id;
    private String name;
    private String description;
    private Boolean done;

    public Task(){}

    public Task(String id, String name, Boolean done) {
        this.id = id;
        this.name = name;
        this.done = done;
    }

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

    public Boolean isDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
