package Cliente.example.ClienteApi.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cliente {
    @Id
    private Long id;
    private String nomeCompleto;
    private String profissao;
}
