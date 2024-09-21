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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Short numero;
    private String bloco;
    private String andar;
    private String banheiros;
    private String quartos;

    public Apartamento() {
    }

    public Apartamento(Integer id, Short numero, String bloco, String andar, String banheiros, String quartos) {
        this.id = id;
        this.numero = numero;
        this.bloco = bloco;
        this.andar = andar;
        this.banheiros = banheiros;
        this.quartos = quartos;
    }
}
