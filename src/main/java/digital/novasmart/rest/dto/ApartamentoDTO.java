package digital.novasmart.rest.dto;

import digital.novasmart.domain.entity.Apartamento;
import digital.novasmart.domain.entity.Bloco;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApartamentoDTO {

    private Short numero;
    private Bloco bloco;
    private String andar;
    private String banheiros;
    private String quartos;

    public ApartamentoDTO() {
    }

    public ApartamentoDTO(Apartamento apartamento) {
        this.numero = apartamento.getNumero();
        this.bloco = apartamento.getBloco();
        this.andar = apartamento.getAndar();
        this.banheiros = apartamento.getBanheiros();
        this.quartos = apartamento.getQuartos();
    }

    public Apartamento toEntity() {
        return new Apartamento(numero, bloco, andar, banheiros, quartos);
    }
}
