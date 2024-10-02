package digital.novasmart.domain.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "apartamento")
public class Apartamento {

    @Id
    @Column(name = "apartamento_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Short numero;

    @ManyToOne
    private Bloco bloco;
    private String andar;
    private String banheiros;
    private String quartos;

    public Apartamento() {
    }

    public Apartamento(Short numero, Bloco bloco, String andar, String banheiros, String quartos) {
        this.numero = numero;
        this.bloco = bloco;
        this.andar = andar;
        this.banheiros = banheiros;
        this.quartos = quartos;
    }

    public Apartamento(Apartamento apartamento) {
        this.numero = apartamento.numero;
        this.bloco = apartamento.bloco;
        this.andar = apartamento.andar;
        this.banheiros = apartamento.banheiros;
        this.quartos = apartamento.quartos;
    }
}
