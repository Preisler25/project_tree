package dev.petrik.project_tree.controller;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class TeamController {
    //req params: day, view, data
    @RequestMapping(method = RequestMethod.GET, value = {"/getTeams"})
    @ResponseBody
    public Object getTeams(@RequestParam("day") String day,
                           @RequestParam("view") String view,
                           @RequestParam("data") String data) {

        System.out.println("day: " + day);
        System.out.println("view: " + view);
        System.out.println("data: " + data);

        Map<String, Object> team1 = new HashMap<>();
        team1.put("id", 1);
        team1.put("data", data);
        team1.put("tasks_for_day", new Object[]{1, 2, 3});
        team1.put("rank", 1);

        //team2

        Map<String, Object> team2 = new HashMap<>();
        team2.put("team_id", 2);
        team2.put("data", data);
        team2.put("tasks_for_day", new Object[]{4, 5, 6});
        team2.put("rank", 2);

        return new Object[]{team1, team2};
    }
}