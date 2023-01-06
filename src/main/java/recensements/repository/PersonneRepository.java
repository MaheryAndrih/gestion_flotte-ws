package recensements.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import recensements.model.Personne;

public interface PersonneRepository extends JpaRepository<Personne, Integer> {
}
