package digital.novasmart.repositories;

import digital.novasmart.entities.Morador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MoradorRepository extends JpaRepository<Morador, Integer> {
}