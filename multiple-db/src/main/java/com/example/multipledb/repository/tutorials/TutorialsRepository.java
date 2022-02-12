package com.example.multipledb.repository.tutorials;


import com.example.multipledb.model.tutorials.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TutorialsRepository extends JpaRepository<Tutorial, Long> {
}
