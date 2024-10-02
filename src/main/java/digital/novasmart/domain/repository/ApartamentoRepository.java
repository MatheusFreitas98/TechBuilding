package digital.novasmart.domain.repository;

import digital.novasmart.domain.entity.Apartamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApartamentoRepository extends JpaRepository<Apartamento, Integer> {
}
