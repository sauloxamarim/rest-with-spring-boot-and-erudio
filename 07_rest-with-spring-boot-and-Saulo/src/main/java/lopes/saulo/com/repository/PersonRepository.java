package lopes.saulo.com.repository;

import lopes.saulo.com.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {}
