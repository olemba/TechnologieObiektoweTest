package com.example.controllers;

import com.example.dao.Pacient;
import com.example.repositories.PacientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Tomasz on 25.11.2016.
 */

@RestController
public class PacientController {
    private PacientRepository pacientRepository;

    @Autowired
    public PacientController(PacientRepository pacientRepository) {
        this.pacientRepository = pacientRepository;
    }

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public List<Pacient> getAll(){
        return pacientRepository.findAll();
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public void addPacient(@RequestBody Pacient pacient){
        pacientRepository.save(pacient);
    }

}
