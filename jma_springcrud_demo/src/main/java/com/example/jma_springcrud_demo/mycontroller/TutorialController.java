package com.example.jma_springcrud_demo.mycontroller;

import com.example.jma_springcrud_demo.model.Tutorial;
import com.example.jma_springcrud_demo.myservices.TutorialServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@RestController
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
    @GetMapping("/tutorials/{model_id}") // ??? are the brackets the same as a template literal while used an as endpoint ???
    public Optional<Tutorial> getTutorialById(@PathVariable("model_id") long model_id){
        return tutorialServices.getTutorialById(model_id);
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
    @PutMapping("/tutorials/{model_id}")
    public void updateTutorial(@PathVariable("model_id") long model_id, @RequestBody Tutorial tutorial){

        // ??? need to ask about Optional again, more clarification
        Optional<Tutorial> tutorialData = tutorialServices.getTutorialById(model_id);

        //
        if(tutorialData.isPresent()){
            Tutorial _tutorial = tutorialData.get();
            _tutorial.setModel_title(tutorial.getModel_title());
            _tutorial.setModel_description(tutorial.getModel_description());
            _tutorial.setModel_published(tutorial.isModel_published());
            tutorialServices.addTutorial(_tutorial);
        }
    }
    // PUT INCANTATION END

    // DELETE INCANTATION START

    // to delete a tutorials record, you use the deleteById() method provided by the tutorialRepository
    // then you pass in the model_id of the record you want to delete

    // DELETE TUTORIAL AT ID
    @DeleteMapping("/tutorials/{model_id}")
    public void deleteTutorial(@PathVariable("model_id") long model_id){
        tutorialServices.deleteTutorial(model_id);
    }

    // DELETE ALL TUTORIALS
    @DeleteMapping("/tutorials")
    public void deleteAllTutorials() {
        tutorialServices.deleteAllTutorials();
    }

    // DELETE INCANTATION END

    // ??? I need to research what this response entity is and how it works

    // FIND BY PUBLISHED TUTORIAL BOOLEAN
    @GetMapping("/tutorials/published")
    public ResponseEntity<List<Tutorial>> findByPublished(){
        return tutorialServices.findByPublished();
    }
}
