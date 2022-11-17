package Cliente.example.ClienteApi.entity;

import javax.persistence.*;
import java.util.List;


@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nomeCompleto;
    private String profissao;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Endereco> endereco;

    public Cliente() {
    }

    public Cliente(Long id, String nomeCompleto, String profissao, List<Endereco> endereco) {
        this.id = id;
        this.nomeCompleto = nomeCompleto;
        this.profissao = profissao;
        this.endereco = endereco;
    }

    public Long getId() {
        return id;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public List<Endereco> getEndereco() {
        return endereco;
    }

    public void setEndereco(List<Endereco> endereco) {
        this.endereco = endereco;
    }
}
