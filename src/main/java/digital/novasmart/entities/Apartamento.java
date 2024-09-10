package digital.novasmart.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "apartamentos")
public class Apartamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String bloco;
    private Short numero;

    public Apartamento() {
    }

    public Apartamento(Integer id, String bloco, Short numero) {
        this.id = id;
        this.bloco = bloco;
        this.numero = numero;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBloco() {
        return bloco;
    }

    public void setBloco(String bloco) {
        this.bloco = bloco;
    }

    public Short getNumero() {
        return numero;
    }

    public void setNumero(Short numero) {
        this.numero = numero;
    }
}
