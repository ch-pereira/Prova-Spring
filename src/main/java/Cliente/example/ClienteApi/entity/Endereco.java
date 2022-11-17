package Cliente.example.ClienteApi.entity;

import javax.persistence.*;

@Entity
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String rua;
    private String cep;
    private Integer numero;

    public Long getId() {
        return id;
    }

    public Endereco(){
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Endereco(String rua, String cep, Integer numero) {
        this.rua = rua;
        this.cep = cep;
        this.numero = numero;
    }
}
