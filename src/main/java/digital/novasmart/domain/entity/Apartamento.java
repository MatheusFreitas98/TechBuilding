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
    private Short numero;
    private String bloco;

    public Apartamento() {
    }

    public Apartamento(Integer id, Short numero, String bloco) {
        this.id = id;
        this.numero = numero;
        this.bloco = bloco;
    }
}
