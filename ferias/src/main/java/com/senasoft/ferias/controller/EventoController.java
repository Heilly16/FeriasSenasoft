package com.senasoft.ferias.controller;

import com.senasoft.ferias.entity.Evento;
import com.senasoft.ferias.service.EventoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/eventos")
public class EventoController {

    @Autowired
    private EventoService eventoService;

    @PostMapping
    public Evento createEvento(@RequestBody Evento evento) {
        return eventoService.save(evento);
    }

    @GetMapping
    public List<Evento> getAllEventos() {
        return eventoService.getAll();
    }
    
}
