package digital.novasmart.domain.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "pessoa")
@Getter
@Setter
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pessoa_id")
    private Integer id;

    private String nome;
    private String sobrenome;
    private String telefone;
    private String documento;

    @OneToMany(mappedBy = "pessoa")
    private List<Perfil> perfis;

    public Pessoa() {
    }

    public Pessoa(String nome, String sobrenome, String telefone, String documento) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.telefone = telefone;
        this.documento = documento;
    }
}
