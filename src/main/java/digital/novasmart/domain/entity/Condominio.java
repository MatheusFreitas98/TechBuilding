package digital.novasmart.domain.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "condominio")
public class Condominio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;
    private String endereco;
    private String telefone;

    @OneToMany(mappedBy = "condominio")
    private List<Bloco> blocos = new ArrayList<>();

    @OneToMany(mappedBy = "condominio")
    private List<AreaDeLazer> areasDeLazer = new ArrayList<>();

    public Condominio() {
    }

    public Condominio(Integer id, String nome, String endereco, String telefone, Bloco bloco, AreaDeLazer areasDeLazer) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.blocos.add(bloco);
        this.areasDeLazer.add(areasDeLazer);
    }
}
