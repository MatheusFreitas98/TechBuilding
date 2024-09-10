package digital.novasmart.repositories;

import digital.novasmart.entities.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MoradorRepository extends JpaRepository<Pessoa, Integer> {
}