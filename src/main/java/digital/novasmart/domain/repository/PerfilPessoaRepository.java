package digital.novasmart.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PerfilPessoaRepository extends JpaRepository<PerfilPessoa, Integer> {
}
