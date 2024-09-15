package com.example.actions_app.service;

import com.example.actions_app.entity.ActionAppEntity;
import com.example.actions_app.repository.ActionAppRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActionAppService {
    private final ActionAppRepository actionAppRepository;

    @Autowired
    public ActionAppService(ActionAppRepository actionAppRepository) {
        this.actionAppRepository = actionAppRepository;
    }

    public List<ActionAppEntity> getData() {
        return actionAppRepository.findAll();
    }
}
