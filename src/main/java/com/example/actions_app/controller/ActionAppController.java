package com.example.actions_app.controller;

import com.example.actions_app.entity.ActionAppEntity;
import com.example.actions_app.service.ActionAppService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ActionAppController {
    private final ActionAppService actionAppService;

    public ActionAppController(ActionAppService actionAppService) {
        this.actionAppService = actionAppService;
    }

    @GetMapping("/data")
    public List<ActionAppEntity> getAllData(){
        return actionAppService.getData();
    }
}
