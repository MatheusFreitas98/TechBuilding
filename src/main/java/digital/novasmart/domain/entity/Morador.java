package digital.novasmart.domain.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@Entity
public class Morador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;
    private String sobrenome;
    private String telefone;

    @OneToMany(mappedBy = "morador")
    private Set<Contrato> contratos;

    @OneToMany(mappedBy = "responsavel")
    private Set<Dependente> dependentes;
}
