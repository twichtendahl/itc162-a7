package com.example.android.tasklist.model;

public class DataTask {

    private String taskId;
    private String listId;
    private String taskName;
    private String taskNotes;
    private String taskDateCompleted;
    private String taskHidden;

    public DataTask() {
    }

    public DataTask(String taskId, String listId, String taskName, String taskNotes, String taskDateCompleted, String taskHidden) {
        this.taskId = taskId;
        this.listId = listId;
        this.taskName = taskName;
        this.taskNotes = taskNotes;
        this.taskDateCompleted = taskDateCompleted;
        this.taskHidden = taskHidden;
    }

    public String getTaskId() {
        return taskId;
    }

    public String getListId() {
        return listId;
    }

    public String getTaskName() {
        return taskName;
    }

    public String getTaskNotes() {
        return taskNotes;
    }

    public String getTaskDateCompleted() {
        return taskDateCompleted;
    }

    public String getTaskHidden() {
        return taskHidden;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public void setListId(String listId) {
        this.listId = listId;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public void setTaskNotes(String taskNotes) {
        this.taskNotes = taskNotes;
    }

    public void setTaskDateCompleted(String taskDateCompleted) {
        this.taskDateCompleted = taskDateCompleted;
    }

    public void setTaskHidden(String taskHidden) {
        this.taskHidden = taskHidden;
    }

    @Override
    public String toString() {
        return "DataTask{" +
                "taskId='" + taskId + '\'' +
                ", listId='" + listId + '\'' +
                ", taskName='" + taskName + '\'' +
                ", taskNotes='" + taskNotes + '\'' +
                ", taskDateCompleted='" + taskDateCompleted + '\'' +
                ", taskHidden='" + taskHidden + '\'' +
                '}';
    }
}
