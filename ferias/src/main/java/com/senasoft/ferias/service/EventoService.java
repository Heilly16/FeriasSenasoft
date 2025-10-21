package com.senasoft.ferias.service;

import com.senasoft.ferias.entity.Evento;
import java.util.List;

public interface EventoService {
    Evento save(Evento evento);
    List<Evento> getAll();
}
