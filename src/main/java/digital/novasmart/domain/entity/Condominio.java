package digital.novasmart.domain.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Condominio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;
    private String endereco;
    private String telefone;

    @OneToMany(mappedBy = "condominio")
    private Set<Bloco> blocos;

    @OneToMany(mappedBy = "condominio")
    private Set<AreaDeLazer> areasDeLazer;

    // Getters and Setters
}
