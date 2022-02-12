package com.example.multipledb.controller;

import com.example.multipledb.model.tutorials.Tutorial;
import com.example.multipledb.service.TutorialsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tutorials")
@RequiredArgsConstructor
public class TutorialsController {

    private final TutorialsService tutorialsService;

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public Tutorial addTutorials(@RequestBody Tutorial tutorials) {
        return tutorialsService.save(tutorials);
    }

    @GetMapping()
    public List<Tutorial> getTutorials() {
        return tutorialsService.getAllTutorials();
    }

}
