package digital.novasmart.services;

import digital.novasmart.entities.Morador;
import digital.novasmart.repositories.MoradorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class MoradorService {

    @Autowired
    private MoradorRepository moradorRepository;

    public Morador salvar(Morador morador) {
        return moradorRepository.save(morador);
    }

    public List<Morador> listarTodos() {
        return moradorRepository.findAll();
    }
}
