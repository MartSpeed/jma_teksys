package com.example.jma_springcrud_demo.mycontroller;

import com.example.jma_springcrud_demo.model.Tutorial;
import com.example.jma_springcrud_demo.myservices.TutorialServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/api")
public class TutorialController {

    // DEPENDENCY INJECTION FROM TUTORIALSERVICES CLASS AS AN OBJECT
    // ??? did i interpret that correctly ???
    @Autowired
    private TutorialServices tutorialServices;

    // GET INCANTATION START
    @GetMapping("/tutorials")
    public List<Tutorial> getAllTutorials(@RequestParam(required = false) String title){
        return tutorialServices.getAllTutorials();
    }

    /*
        DESCRIPTION: getTutorialById()
        the tutorialRepository provides a method finById(). This method
        takes the id of the tutorial to find.
     */
    @GetMapping("/tutorials/{modelId}")
    public Optional<Tutorial> getTutorialById(@PathVariable("modelId") long modelId){
        return tutorialServices.getTutorialById(modelId);
    }

    // GET INCANTATION END

    // POST INCANTATION START

    @PostMapping("/tutorials")
    public void createTutorial(@RequestBody Tutorial tutorial) {
        tutorialServices.addTutorial(tutorial);
    }

    // POST INCANTATION END

    // PUT INCANTATION START

    // to update a tutorial record, we use the same save() and findById()
    @PutMapping("/tutorials/{modelId}")
    public void updateTutorial(@PathVariable("modelId") long modelId, @RequestBody Tutorial tutorial){

        Optional<Tutorial> tutorialData = tutorialServices.getTutorialById(modelId);

        //
        if(tutorialData.isPresent()){
            Tutorial _tutorial = tutorialData.get();
            _tutorial.setModelTitle(tutorial.getModelTitle());
            _tutorial.setModelDescription(tutorial.getModelDescription());
            _tutorial.setModelPublished(tutorial.isModelPublished());
            tutorialServices.addTutorial(_tutorial);
        }
    }
    // PUT INCANTATION END

    // DELETE INCANTATION START

    // to delete a tutorials record, you use the deleteById() method provided by the tutorialRepository
    // then you pass in the model_id of the record you want to delete

    // DELETE TUTORIAL AT ID
    @DeleteMapping("/tutorials/{modelId}")
    public void deleteTutorial(@PathVariable("modelId") long modelId){
        tutorialServices.deleteTutorial(modelId);
    }

    // DELETE ALL TUTORIALS
    @DeleteMapping("/tutorials")
    public void deleteAllTutorials() {
        tutorialServices.deleteAllTutorials();
    }

    // DELETE INCANTATION END

    // ??? I need to research what this response entity is and how it works

    // FIND BY PUBLISHED TUTORIAL BOOLEAN
    @GetMapping("/tutorials/model_published")
    public ResponseEntity<List<Tutorial>> findByModelPublished(){
        return tutorialServices.findByModelPublished();
    }
}
