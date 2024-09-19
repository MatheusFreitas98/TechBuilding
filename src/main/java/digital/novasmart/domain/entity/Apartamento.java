package digital.novasmart.domain.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "apartamento")
@Getter
@Setter
public class Apartamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String apartamento;
    private String bloco;

    public Apartamento() {
    }

    public Apartamento(Integer id, String apartamento, String bloco) {
        this.id = id;
        this.apartamento = apartamento;
        this.bloco = bloco;
    }
}
