package com.example.jma_springcrud_demo.myservices;

import com.example.jma_springcrud_demo.model.Tutorial;
import com.example.jma_springcrud_demo.repository.TutorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TutorialServices {
    @Autowired
    private TutorialRepository tutorialRepository; // TUTORIAL DAO

    // RETRIEVING TUTORIALS
    public List<Tutorial> getAllTutorials() {
        List<Tutorial> tutorials = new ArrayList<Tutorial>(); // create new tutorial object
        // ??????? where is the documentation for forEach() ???????
        tutorialRepository.findAll().forEach(tutorials::add);
        return tutorials;
    }
}
