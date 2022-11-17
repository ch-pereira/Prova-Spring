package Cliente.example.ClienteApi.repository;

import Cliente.example.ClienteApi.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Cliente, Long> {
}
