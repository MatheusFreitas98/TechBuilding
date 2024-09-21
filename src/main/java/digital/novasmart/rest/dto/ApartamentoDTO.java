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
    private String andar;
    private String banheiros;
    private String quartos;

    public ApartamentoDTO() {
    }

    public ApartamentoDTO(Apartamento apartamento) {
        this.id = apartamento.getId();
        this.numero = apartamento.getNumero();
        this.bloco = apartamento.getBloco();
        this.andar = apartamento.getAndar();
        this.banheiros = apartamento.getBanheiros();
        this.quartos = apartamento.getQuartos();
    }

    public Apartamento toEntity() {
        return new Apartamento(id, numero, bloco, andar, banheiros, quartos);
    }
}
