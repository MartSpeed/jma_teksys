package com.example.jma_springcrud_demo.myservices;

import com.example.jma_springcrud_demo.model.Tutorial;
import com.example.jma_springcrud_demo.repository.TutorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    // RETRIEVING TUTORIALS BY ID FIELD
    public Optional<Tutorial> getTutorialById(Long modelId){
        return tutorialRepository.findById(modelId);
    }

    // ADDING THE CURRENT CREATED TUTORIAL TO THE DATABASE COLLECTION
    public void addTutorial(Tutorial tutorial){
        tutorialRepository.save(tutorial);
    }

    // UPDATE THE TUTORIAL WITH THE NEW TUTORIAL MODEL INFO
    public void updateTutorial(long modelId, Tutorial tutorial){
        // ??????? Need to do more research on Optional, its not sticking
        Optional<Tutorial> tutorialData = tutorialRepository.findById(modelId);

        // if data is present set the model data to the get() information retrieved and then save it
        if(tutorialData.isPresent()) {
            Tutorial _tutorial = tutorialData.get();
            _tutorial.setModelTitle((tutorial.getModelTitle()));
            _tutorial.setModelDescription((tutorial.getModelDescription()));
            _tutorial.setModelPublished(tutorial.isModelPublished());
            tutorialRepository.save(_tutorial);
        }
    }

    // DELETE BY ID
    public void deleteTutorial(long modelId){
        tutorialRepository.deleteById(modelId);
    }

    // DELETE ALL TUTORIALS
    public void deleteAllTutorials(){
        tutorialRepository.deleteAll();;
    }

    // FIND BY PUBLISHED IN LIST
    public ResponseEntity<List<Tutorial>> findByModelPublished(){
        //
        try{
            List<Tutorial> tutorials = tutorialRepository.findByModelPublished(true);

            //
            if(tutorials.isEmpty()){
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(tutorials, HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
