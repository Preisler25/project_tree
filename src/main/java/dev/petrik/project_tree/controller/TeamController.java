package dev.petrik.project_tree.controller;

import dev.petrik.project_tree.model.Task;
import dev.petrik.project_tree.model.Team;
import org.springframework.web.bind.annotation.*;


@RestController
public class TeamController {
    //req params: day, view, data
    @RequestMapping(method = RequestMethod.GET, value = {"/getTeams"})
    @ResponseBody
    public Object getTeams(@RequestParam("day") String day,
                           @RequestParam("view") String view,
                           @RequestParam("data") String data) {

        Task task1 = new Task(1, 1, 1, "task1", false, 100, 0);
        Task task2 = new Task(2, 1, 1, "task2", false, 100, 0);
        Task task3 = new Task(3, 1, 1, "task3", false, 100, 0);
        Task task4 = new Task(4, 1, 2, "task4", false, 100, 0);
        Task task5 = new Task(5, 1, 2, "task5", false, 100, 0);

        Team team1 = new Team(1, data, new Task[]{task1, task2, task3}, 1);
        Team team2 = new Team(2, data, new Task[]{task4, task5}, 2);

        return new Object[]{team1, team2};
    }
}