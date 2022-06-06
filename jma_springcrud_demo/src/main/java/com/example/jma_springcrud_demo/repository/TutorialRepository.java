package com.example.jma_springcrud_demo.repository;

import com.example.jma_springcrud_demo.model.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
    // findByPublished() custom method
    /* DESCRIPTION:
    *  returns all Tutorials with published having value as input published
    * */

    List<Tutorial> findByPublished(boolean published);
}
