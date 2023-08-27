package dev.petrik.project_tree.controller;


import dev.petrik.project_tree.model.Task;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class WebSocketController {

    @MessageMapping("/click")
    @SendTo("/ws/trieng")
    public Task taskCh(Task task) {
        System.out.println(task.toString());
        return new Task(100, 10, 10, "task_test", false, 10000, 0);
    }
}
