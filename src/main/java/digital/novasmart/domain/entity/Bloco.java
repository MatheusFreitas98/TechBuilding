package digital.novasmart.domain.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Bloco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;
    private String descricao;

    @OneToMany(mappedBy = "bloco")
    private Set<Apartamento> apartamentos;

    // Getters and Setters
}
