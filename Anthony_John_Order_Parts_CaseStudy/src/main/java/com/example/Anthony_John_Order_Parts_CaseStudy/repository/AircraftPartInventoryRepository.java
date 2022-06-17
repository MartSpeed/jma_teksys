/*  AUTHOR: John Anthony
 *  DESCRIPTION: The AircraftRepository will need to know:
 *  1a. what issues the aircraft has
 *      a. what is stopping the aircraft from being flight ready
 *      b. how to fix the issue to make the condition flight ready
 *  1b. what issues the aircraft does not have
 *      a. aircraft is free of issues and is flight ready
 *  2a. what parts currently work
 *  2b. what parts dont currently work
 *  3. what is the status of the aircraft:
 *      a. Red X(aircraft broken, needs parts)
 *      b. Red slash /(aircraft broken, needs fix)
 *      c. Black Dash - (inspection is needed)
 *  4. is this aircraft flight ready
 *  ===EXTRA===
 *  5. create a new ticket for newly arrived aircraft
 */
package com.example.Anthony_John_Order_Parts_CaseStudy.repository;


import com.example.Anthony_John_Order_Parts_CaseStudy.entity.AircraftPartInventoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AircraftPartInventoryRepository extends JpaRepository<AircraftPartInventoryEntity, Long> {

}
