package digital.novasmart.domain.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter

@Entity
public class Contrato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "morador_id")
    private Morador morador;

    @ManyToOne
    @JoinColumn(name = "apartamento_id")
    private Apartamento apartamento;

    @Temporal(TemporalType.DATE)
    private Date dataContrato;

    private BigDecimal valor;

    @Enumerated(EnumType.STRING)
    private TipoContrato tipoContrato;

    private String descricao;

    public enum TipoContrato {
        COMPRA, VENDA, ALUGUEL
    }
}
