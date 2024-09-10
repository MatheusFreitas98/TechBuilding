package digital.novasmart.services;

import digital.novasmart.entities.Pessoa;
import digital.novasmart.repositories.MoradorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class MoradorService {

    @Autowired
    private MoradorRepository moradorRepository;

    public Pessoa salvar(Pessoa pessoa) {
        return moradorRepository.save(pessoa);
    }

    public List<Pessoa> listarTodos() {
        return moradorRepository.findAll();
    }
}
