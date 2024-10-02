package digital.novasmart.rest.dto;

import digital.novasmart.domain.entity.Contrato;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
public class ContratoDTO {

    private Integer id;
    private Integer moradorId;
    private Integer apartamentoId;
    private Date dataContrato;
    private BigDecimal valor;
    private String tipoContrato; // Usando String para o TipoContrato
    private String descricao;

    public ContratoDTO() {
    }

    public ContratoDTO(Integer id, Integer moradorId, Integer apartamentoId, Date dataContrato, BigDecimal valor, String tipoContrato, String descricao) {
        this.id = id;
        this.moradorId = moradorId;
        this.apartamentoId = apartamentoId;
        this.dataContrato = dataContrato;
        this.valor = valor;
        this.tipoContrato = tipoContrato;
        this.descricao = descricao;
    }

    public ContratoDTO(Contrato contrato) {
        this.id = contrato.getId();
        this.moradorId = contrato.getMorador() != null ? contrato.getMorador().getId() : null;
        this.apartamentoId = contrato.getApartamento() != null ? contrato.getApartamento().getId() : null;
        this.dataContrato = contrato.getDataContrato();
        this.valor = contrato.getValor();
        this.tipoContrato = contrato.getTipoContrato() != null ? contrato.getTipoContrato().name() : null;
        this.descricao = contrato.getDescricao();
    }
}
