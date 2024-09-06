// src/main/java/com/luqueacademy/backend/controller/CelularController.java
package com.luqueacademy.backend.controller;

import com.luqueacademy.backend.model.Celular;
import com.luqueacademy.backend.repository.CelularRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/celulares")
public class CelularController {

    @Autowired
    private CelularRepository celularRepository;

    @GetMapping
    public List<Celular> getAllCelulares() {
        return celularRepository.findAll();
    }
}
