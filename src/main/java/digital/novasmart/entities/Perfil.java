package digital.novasmart.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "perfil")
public class Perfil {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_perfil")
    private Integer id;

    private String descricao;

    @ManyToMany(mappedBy = "perfis")
    private List<Pessoa> pessoas;

    public Perfil() {
    }

    public Perfil(String descricao, Integer id) {
        this.descricao = descricao;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
