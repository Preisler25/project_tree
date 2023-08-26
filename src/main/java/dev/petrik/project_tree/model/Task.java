package dev.petrik.project_tree.model;

public class Task {
    private int id;
    private int day_id;
    private int team_id;
    private String name;
    private Boolean is_done;
    private int max_points;
    private int points;

    public Task(int id, int day_id, int team_id, String name, Boolean is_done, int max_points, int points) {
        this.id = id;
        this.day_id = day_id;
        this.team_id = team_id;
        this.name = name;
        this.is_done = is_done;
        this.max_points = max_points;
        this.points = points;
    }

    public Task() {
    }

    public int getId() {
        return id;
    }

    public int getDay_id() {
        return day_id;
    }

    public int getTeam_id() {
        return team_id;
    }

    public String getName() {
        return name;
    }

    public Boolean getIs_done() {
        return is_done;
    }

    public int getMax_points() {
        return max_points;
    }

    public int getPoints() {
        return points;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDay_id(int day_id) {
        this.day_id = day_id;
    }

    public void setTeam_id(int team_id) {
        this.team_id = team_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIs_done(Boolean is_done) {
        this.is_done = is_done;
    }

    public void setMax_points(int max_point) {
        this.max_points = max_point;
    }

    public void setPoints(int points) {
        this.points = points;
    }

}
