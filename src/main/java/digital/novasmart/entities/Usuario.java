package digital.novasmart.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String login;
    private String senha;

    @Column(name = "data_cadastro")
    @CreationTimestamp
    private LocalDateTime dataCadastro;

    @UpdateTimestamp
    @Column(name = "data_ultimo_login")
    private LocalDateTime dataUltimoLogin;

    public Usuario() {
    }

    public Usuario(String login, String senha, LocalDateTime dataCadastro, LocalDateTime dataUltimoLogin, Integer morador) {
        this.login = login;
        this.senha = senha;
        this.dataCadastro = dataCadastro;
        this.dataUltimoLogin = dataUltimoLogin;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public LocalDateTime getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDateTime dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public LocalDateTime getDataUltimoLogin() {
        return dataUltimoLogin;
    }

    public void setDataUltimoLogin(LocalDateTime dataUltimoLogin) {
        this.dataUltimoLogin = dataUltimoLogin;
    }
}
