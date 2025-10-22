package com.senasoft.ferias.serviceimpl;

import com.senasoft.ferias.entity.Evento;
import com.senasoft.ferias.repository.EventoRepository;
import com.senasoft.ferias.service.EventoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventoServiceImpl implements EventoService {

    //LLlamado al repositorio
    @Autowired
    private EventoRepository eventoRepository;

    @Override
    public Evento save(Evento evento) {
        return eventoRepository.save(evento);
    }

    @Override
    public List<Evento> getAll() {
        return eventoRepository.findAll();
    }
}
