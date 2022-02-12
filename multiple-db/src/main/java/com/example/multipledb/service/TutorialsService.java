package com.example.multipledb.service;

import com.example.multipledb.model.tutorials.Tutorial;

import java.util.List;

public interface TutorialsService {

    Tutorial save(Tutorial tutorials);

    List<Tutorial> getAllTutorials();

}
