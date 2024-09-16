package digital.novasmart.rest.dto;

import digital.novasmart.domain.entity.Perfil;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PerfilDTO {

    private Integer id;
    private String descricao;

    public PerfilDTO() {
    }

    public PerfilDTO(Perfil perfil) {
        this.id = perfil.getId();
        this.descricao = perfil.getDescricao();
    }

    public Perfil toEntity() {
        return new Perfil(descricao);
    }
}
