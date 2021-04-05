package soa.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;
import soa.model.Starship;

@Repository
public interface StarshipRepository extends JpaRepositoryImplementation<Starship, Long> {
}
