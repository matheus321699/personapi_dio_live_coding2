package one.digitalinnovation.personapi2.repository;

import one.digitalinnovation.personapi2.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {




}
