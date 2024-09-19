package digital.novasmart.rest.dto;

import digital.novasmart.domain.entity.Apartamento;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApartamentoDTO {

    private Integer id;
    private Short numero;
    private String bloco;

    public ApartamentoDTO() {
    }

    public ApartamentoDTO(Apartamento apartamento) {
        this.id = apartamento.getId();
        this.numero = apartamento.getNumero();
        this.bloco = apartamento.getBloco();
    }

    public Apartamento toEntity() {
        return new Apartamento(id, numero, bloco);
    }
}
