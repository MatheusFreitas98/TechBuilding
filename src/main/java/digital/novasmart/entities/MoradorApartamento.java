package digital.novasmart.entities;

import jakarta.persistence.*;

@Entity
@Table
public class MoradorApartamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @
    private Pessoa pessoa;
    private Apartamento apartamento;

}
