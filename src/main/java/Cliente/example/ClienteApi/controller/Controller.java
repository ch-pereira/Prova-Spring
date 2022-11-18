package Cliente.example.ClienteApi.controller;

import Cliente.example.ClienteApi.entity.Cliente;
import Cliente.example.ClienteApi.entity.Endereco;
import Cliente.example.ClienteApi.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/cliente/v1/")

public class Controller {
    @Autowired
    Repository repository;

    @PostMapping
    public Cliente create(@RequestBody Cliente cliente){
        Cliente clienteSaved = repository.save(cliente);
        return clienteSaved;
    }

    @GetMapping("/{id}")
    @ResponseBody
    public Optional<Cliente> getClienteById(@PathVariable Long id){
        Optional<Cliente> clienteReturned = repository.findById(id);
        return clienteReturned;
    }

    @DeleteMapping("/{id}")
    public String deleteClienteById(@PathVariable Long id){
        try{
            Optional<Cliente> cliente = Optional.of(repository.getById(id));
            if (cliente.isPresent()){
                repository.deleteById(id);
                return "Cliente de "+id+" deletado com sucesso!";
            }else {
                throw new Exception();
            }
        }catch (Exception e){
            e.printStackTrace();
            return "O cliente de "+id+" não existe para ser deletado!"+
                    "Por favor, entre em contato com o atendimento 999 999 666";
        }
    }

    @GetMapping
    public List<Cliente> listClientes(){
        return repository.findAll();
    }
}

