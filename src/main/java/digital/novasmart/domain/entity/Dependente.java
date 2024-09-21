package digital.novasmart.domain.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
public class Dependente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;
    private String parentesco;

    @ManyToOne
    @JoinColumn(name = "morador_id")
    private Morador responsavel;

    public Dependente() {
    }

    public Dependente(Integer id, String nome, String parentesco, Morador responsavel) {
        this.id = id;
        this.nome = nome;
        this.parentesco = parentesco;
        this.responsavel = responsavel;
    }
}
