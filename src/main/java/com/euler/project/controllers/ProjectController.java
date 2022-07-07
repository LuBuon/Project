package com.euler.project.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/project")

public class ProjectController {
    @RequestMapping(path = "/ping")
    public @ResponseBody String ping() {

        System.out.println("Hola Mundo");
        return "pong";
    }
}
