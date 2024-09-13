package digital.novasmart.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "perfil_pessoa")
public class PerfilPessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "perfil_pessoa_id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "perfil_id")
    private Perfil perfil;

    @ManyToOne
    @JoinColumn(name = "pessoa_id")
    private Pessoa pessoa;

}
