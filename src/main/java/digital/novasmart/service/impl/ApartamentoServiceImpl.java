package digital.novasmart.service.impl;

import digital.novasmart.domain.entity.Apartamento;
import digital.novasmart.domain.repository.ApartamentoRepository;
import digital.novasmart.rest.dto.ApartamentoDTO;
import digital.novasmart.rest.dto.PerfilDTO;
import digital.novasmart.service.ApartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ApartamentoServiceImpl implements ApartamentoService {

    @Autowired
    ApartamentoRepository repository;

    @Override
    public List<ApartamentoDTO> listarApartamentos() {
        List<Apartamento> apartamentos = repository.findAll();
        return apartamentos.stream().map(apartamento -> new ApartamentoDTO(apartamento)).collect(Collectors.toList());
    }

    @Override
    public ApartamentoDTO cadastrarApartamento(ApartamentoDTO apartamentoDTO) {
        Apartamento apartamento = new Apartamento(apartamentoDTO.getId(), apartamentoDTO.getNumero(), apartamentoDTO.getBloco());
        apartamento = repository.save(apartamento);
        return new ApartamentoDTO(apartamento);
    }
}