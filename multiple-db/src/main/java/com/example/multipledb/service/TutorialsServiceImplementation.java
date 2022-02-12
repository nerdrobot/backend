package com.example.multipledb.service;

import com.example.multipledb.model.tutorials.Tutorial;
import com.example.multipledb.repository.tutorials.TutorialsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TutorialsServiceImplementation implements TutorialsService {

    private final TutorialsRepository repository;

    @Override
    public Tutorial save(Tutorial tutorials) {
        return repository.save(tutorials);
    }

    @Override
    public List<Tutorial> getAllTutorials() {
        return repository.findAll();
    }
}
