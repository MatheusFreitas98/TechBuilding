package digital.novasmart.domain.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "area_de_lazer")
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
