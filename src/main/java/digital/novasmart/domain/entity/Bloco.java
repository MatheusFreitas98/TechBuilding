package digital.novasmart.domain.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "bloco")
public class Bloco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;
    private String descricao;

    @OneToMany(mappedBy = "bloco")
    private List<Apartamento> apartamentos = new ArrayList<>();

    @ManyToOne
    private Condominio condominio;

    public Bloco() {
    }

    public Bloco(Integer id, String nome, String descricao, Apartamento apartamento) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.apartamentos.add(apartamento);
    }
}
