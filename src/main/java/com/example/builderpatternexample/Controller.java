package com.example.builderpatternexample;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
@RequestMapping("/api/card")
public class Controller {

    private Controller controller;

    public void controller(Controller controller) {
        this.controller = controller;
    }

    @GetMapping("/all")
    public @ResponseBody Iterable<Card> getAllCards() {
        return controller.getAllCards();
    }
}
