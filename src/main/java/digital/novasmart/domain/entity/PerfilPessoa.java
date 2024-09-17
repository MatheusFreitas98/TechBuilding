package digital.novasmart.domain.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "perfil_pessoa")
@Getter
@Setter
public class PerfilPessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "perfil_pessoa_id")
    private Integer id;
    private Integer perfil_id;
    private Integer pessoa_id;

    public PerfilPessoa(Integer perfil_id, Integer pessoa_id) {
        this.perfil_id = perfil_id;
        this.pessoa_id = pessoa_id;
    }
}
