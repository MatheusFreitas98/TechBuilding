package digital.novasmart.repositories;

import digital.novasmart.entities.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaController extends JpaRepository<Pessoa, Integer> {
}
