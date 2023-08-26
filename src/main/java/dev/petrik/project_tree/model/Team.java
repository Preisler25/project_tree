package dev.petrik.project_tree.model;


public class Team {
    private int id;
    private String data;
    private Task[] tasks_for_day;
    private int rank;

    public Team(int id, String data, Task[] tasks_for_day, int rank) {
        this.id = id;
        this.data = data;
        this.tasks_for_day = tasks_for_day;
        this.rank = rank;
    }

    public Team() {
    }

    public int getId() {
        return id;
    }

    public String getData() {
        return data;
    }

    public Task[] getTasks_for_day() {
        return tasks_for_day;
    }

    public int getRank() {
        return rank;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setTasks_for_day(Task[] tasks_for_day) {
        this.tasks_for_day = tasks_for_day;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
}
