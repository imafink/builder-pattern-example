package com.example.builderpatternexample;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/api/card")
public class Controller {
    
    @Autowired
    private Controller controller;

    public void controller(Controller controller) {
        this.controller = controller;
    }

    @GetMapping("/all")
    public @ResponseBody Iterable<Card> getAllCards() {
        return controller.getAllCards();
    }
}
