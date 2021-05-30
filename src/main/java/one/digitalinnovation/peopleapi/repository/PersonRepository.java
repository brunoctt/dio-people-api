package one.digitalinnovation.peopleapi.repository;

import one.digitalinnovation.peopleapi.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
