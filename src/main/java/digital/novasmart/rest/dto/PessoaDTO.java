package digital.novasmart.rest.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PessoaDTO {

    private Integer id;
    private String nome;
    private String sobrenome;
    private String telefone;
    private String documento;
    private String perfil;

    public PessoaDTO() {
    }

    public PessoaDTO(Pessoa pessoa) {
        this.id = pessoa.getId();
        this.nome = pessoa.getNome();
        this.sobrenome = pessoa.getSobrenome();
        this.telefone = pessoa.getTelefone();
        this.documento = pessoa.getDocumento();
    }

    public Pessoa toEntity() {
        return new Pessoa(nome, sobrenome, telefone, documento);
    }
}
