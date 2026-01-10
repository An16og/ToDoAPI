package com.example.ToDo;

public class Task {
    private int id;
    private String task;
    private Boolean state;
    public Task(){}
    public Task(int id,String task,Boolean state){
        this.id=id;
        this.task=task;
        this.state=state;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }


}
