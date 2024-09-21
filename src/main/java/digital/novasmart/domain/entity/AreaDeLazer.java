package digital.novasmart.domain.entity;

import jakarta.persistence.*;

@Entity
public class AreaDeLazer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;
    private String descricao;

    @ManyToOne
    @JoinColumn(name = "condominio_id")
    private Condominio condominio;

    // Getters and Setters
}
