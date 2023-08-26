package dev.petrik.project_tree.controller;


import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@Controller
public class WebSocketController {

    private final Logger logger = LoggerFactory.getLogger(WebSocketController.class);

    @MessageMapping("/connect")
    public String connect() {
        System.out.println("Connected");
        return "Connected";
    }

    @MessageMapping("/points")
    @SendTo("/ws/point")
    public String pointCH(String message) {
        System.out.println("click: " + message);
        return message;
    }
}
