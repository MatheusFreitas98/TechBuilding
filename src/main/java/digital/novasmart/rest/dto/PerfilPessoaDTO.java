package digital.novasmart.rest.dto;

import digital.novasmart.domain.entity.PerfilPessoa;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PerfilPessoaDTO {

    private Integer id;
    private Integer perfil_id;
    private Integer pessoa_id;

    public PerfilPessoaDTO() {
    }

    public PerfilPessoaDTO(PerfilPessoa perfilPessoa) {
        this.id = perfilPessoa.getId();
        this.perfil_id = perfilPessoa.getPerfil_id();
        this.pessoa_id = perfilPessoa.getPessoa_id();
    }


}
