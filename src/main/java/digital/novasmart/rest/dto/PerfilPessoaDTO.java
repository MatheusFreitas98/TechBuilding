package digital.novasmart.rest.dto;

import digital.novasmart.domain.entity.PerfilPessoa;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PerfilPessoaDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer perfil_id;
    private Integer pessoa_id;

    public PerfilPessoaDTO() {
    }

    public PerfilPessoaDTO(Integer perfil_id, Integer pessoa_id) {
        this.perfil_id = perfil_id;
        this.pessoa_id = pessoa_id;
    }

    public PerfilPessoa toEntity() {
        return new PerfilPessoa(perfil_id, pessoa_id);
    }
}
