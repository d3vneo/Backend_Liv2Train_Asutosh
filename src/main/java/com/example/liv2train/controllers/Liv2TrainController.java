package com.example.liv2train.controllers;

import com.example.liv2train.models.TrainingCentre;
import com.example.liv2train.repos.TrainingCentreRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
public class Liv2TrainController {
    @Autowired
    private TrainingCentreRepo centreRepo;

    @PostMapping("/create")
    ResponseEntity<TrainingCentre> create(@Valid @RequestBody TrainingCentre trainingCentre) {
        TrainingCentre centre = centreRepo.save(trainingCentre);
        return new ResponseEntity<TrainingCentre>(centre, HttpStatus.OK);
    }

    @GetMapping("/view")
    List<TrainingCentre> view() {
        return centreRepo.findAll();
    }

    // Find by centre code
    @GetMapping("/view/{id}")
    Optional<TrainingCentre> viewById(@PathVariable String id) {
        return centreRepo.findById(id);
    }
}
